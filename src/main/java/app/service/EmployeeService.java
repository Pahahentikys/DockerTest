package app.service;

import app.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface EmployeeService {

    Page<Employee> getAll(Pageable pageable);
}
