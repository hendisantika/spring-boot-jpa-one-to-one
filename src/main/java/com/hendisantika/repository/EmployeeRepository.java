package com.hendisantika.repository;

import com.hendisantika.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-one-to-one
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/04/22
 * Time: 14.49
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
