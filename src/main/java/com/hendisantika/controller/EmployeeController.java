package com.hendisantika.controller;

import com.hendisantika.model.Employee;
import com.hendisantika.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @PostMapping(consumes = "application/json", produces = "application/json", path = "/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
        return new ResponseEntity<>(employeeService.createEmployee(emp), HttpStatus.CREATED);
    }

    @PutMapping(consumes = "application/json", produces = "application/json", path = "/employees")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
        return new ResponseEntity<>(employeeService.updateEmployee(emp), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/employees/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable(value = "empId") Long empId) {
        employeeService.deleteEmployee(empId);
        return new ResponseEntity<>("Employee with EmployeeId : " + empId + " deleted successfully", HttpStatus.OK);
    }

    @GetMapping(path = "/employees/{empId}", produces = "application/json")
    public ResponseEntity<Employee> getEmployee(@PathVariable(value = "empId") Long empId) {
        return new ResponseEntity<>(employeeService.getEmployee(empId), HttpStatus.OK);
    }

    @GetMapping(path = "/employees", produces = "application/json")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
    }
}
