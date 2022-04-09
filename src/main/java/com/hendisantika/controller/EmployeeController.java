package com.hendisantika.controller;

import com.hendisantika.model.Employee;
import com.hendisantika.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping(consumes = "application/json", produces = "application/json", path = "/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
        return new ResponseEntity<>(employeeService.updateEmployee(emp), HttpStatus.CREATED);
    }

    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/employee/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable(value = "empId") Long empId) {
        employeeService.deleteEmployee(empId);
        return new ResponseEntity<>("Employee with EmployeeId : " + empId + " deleted successfully", HttpStatus.OK);
    }
}
