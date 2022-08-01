package com.shurjomukhi.crud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shurjomukhi.crud.model.entity.Employee;
import com.shurjomukhi.crud.service.EmployeeService;

/**
 * This controller is used to crud operation with employee
 * @author Fahim
 * @since 2022-07-25
 *
 */
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEmployees(){
		
		List<Employee> employeeList = service.getAllEmployees();
		return ResponseEntity.ok(employeeList);
	}
	
	@GetMapping("/{emp_id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("emp_id") Integer empId){
		System.out.println(empId);
		Employee employee = service.getEmployeeById(empId);
		return ResponseEntity.ok(employee);
		
	}

	/**
	 * 
	 * This method is used to save {@link Employee} details
	 * @param employee
	 * @return a successfully saved employee
	 */
	@PostMapping
	public ResponseEntity<Employee> insertEmployee(@Valid @RequestBody Employee employee){
		var emp = service.saveEmp(employee);
		return ResponseEntity.ok(emp);
	}
	
	@PutMapping
	public ResponseEntity<Employee> updateEmployee(@Valid @RequestBody Employee employee){
		var emp = service.updateEmployee(employee);
		return ResponseEntity.ok(emp);
	}
	
	@DeleteMapping("/{emp_id}")
	public ResponseEntity<List<Employee>> deleteEmployeeById(@PathVariable("emp_id") Integer empId){
		service.deleteEmployeeById(empId);
		List<Employee> employeeList = service.getAllEmployees();
		return ResponseEntity.ok(employeeList);
		//return ResponseEntity.ok("Successfully deleted");
	}
	
}
