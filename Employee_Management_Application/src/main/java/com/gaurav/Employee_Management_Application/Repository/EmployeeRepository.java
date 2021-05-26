package com.gaurav.Employee_Management_Application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.Employee_Management_Application.Model.Employee;

@Repository
public interface  EmployeeRepository extends JpaRepository<Employee, Long> {

}
