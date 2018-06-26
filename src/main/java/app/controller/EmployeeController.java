package app.controller;

import app.domain.Employee;
import app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<Page<Employee>> getAll(@RequestParam(name="page", defaultValue = "0") int page,
                                                 @RequestParam(name = "page_size", defaultValue = "2") int pageSize) {

        return ResponseEntity.ok(employeeService.getAll(PageRequest.of(page, pageSize)));
    }

}
