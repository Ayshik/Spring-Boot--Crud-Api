package com.shurjomukhi.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shurjomukhi.crud.model.entity.Employee;
import com.shurjomukhi.crud.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> getAllEmployees() {
		var employees = repo.findAll();
		return employees;
	}

	public Employee getEmployeeById(Integer empId) {	
		var employee = repo.findById(empId).get();
		return employee;
	}
	
	public Employee saveEmp(Employee employee) {
		Employee emp = repo.save(employee);
		return emp;
	}

	public Employee updateEmployee(Employee employee) {
		var emp = repo.save(employee);
		return emp;
	}
	
	public void deleteEmployeeById(Integer empId) {
				repo.deleteById(empId);
		
		
	}

}
