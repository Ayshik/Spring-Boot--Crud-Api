package com.shurjomukhi.crud.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shurjomukhi.crud.model.entity.Employee;

@SpringBootTest
class EmployeeServiceTest {
	
	@Autowired
	private EmployeeService service;
	
	@Test
	void testGetAllEmployees() {
		
		System.out.println(service.getAllEmployees().size());
		
	}
	
	@Test
	void testSaveEmployee() {
		Employee employee = new Employee();
		employee.setName("ATM Fahim");
		employee.setPhoneNum(19876543);
		assertNotNull(service.saveEmp(employee));
	}
	
	@Test
	void testDeleteEmployee(Integer empId) {
		//Employee employee = new Employee();
		
		service.deleteEmployeeById(empId);
	}
	

}
