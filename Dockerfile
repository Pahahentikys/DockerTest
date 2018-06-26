FROM openjdk:9-jre-slim

EXPOSE 3744

COPY ./target/Test.jar /opt/Test/Test.jar

ENTRYPOINT ["java", "-jar", "-Dspring.profile=local", "/opt/Test/Test.jar"]