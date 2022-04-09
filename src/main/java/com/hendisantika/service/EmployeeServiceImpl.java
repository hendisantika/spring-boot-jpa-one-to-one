package com.hendisantika.service;

import com.hendisantika.model.Employee;
import com.hendisantika.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-one-to-one
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/04/22
 * Time: 14.50
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }
}
