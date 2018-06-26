CREATE SCHEMA docker_test;
CREATE TABLE docker_test.employee(
id SERIAL,
name VARCHAR(45) NOT NULL,
surname VARCHAR(45) NOT NULL,
PRIMARY KEY (id)
);