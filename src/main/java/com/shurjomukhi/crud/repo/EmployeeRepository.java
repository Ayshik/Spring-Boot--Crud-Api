package com.shurjomukhi.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shurjomukhi.crud.model.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
