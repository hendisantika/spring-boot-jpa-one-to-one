package com.hendisantika.controller;

import com.hendisantika.model.Employee;
import com.hendisantika.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-one-to-one
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/04/22
 * Time: 14.52
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(consumes = "application/json", produces = "application/json", path = "/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
        return new ResponseEntity<>(employeeService.createEmployee(emp), HttpStatus.CREATED);
    }
}
