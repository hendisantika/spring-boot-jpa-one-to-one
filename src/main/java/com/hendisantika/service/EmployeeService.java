package com.hendisantika.service;

import com.hendisantika.model.Employee;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-one-to-one
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/04/22
 * Time: 14.49
 */
public interface EmployeeService {
    Employee createEmployee(Employee emp);

    Employee updateEmployee(Employee emp);

    Employee getEmployee(Long empId);

    void deleteEmployee(Long empId);

    List<Employee> getAllEmployee();
}
