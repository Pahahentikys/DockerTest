package app.service.implementation;

import app.domain.Employee;
import app.repository.EmployeeRepository;
import app.service.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class EmployeeServiceImplementation implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    EmployeeServiceImplementation(EmployeeRepository employeeRepository){

        this.employeeRepository = employeeRepository;
    }

    @Override
    public Page<Employee> getAll(Pageable pageable) {

        return employeeRepository.findAll(pageable);
    }
}
