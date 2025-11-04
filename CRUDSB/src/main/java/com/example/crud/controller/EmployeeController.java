package com.example.crud.controller;

import java.util.List;
import java.util.Map;
import com.example.crud.service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entity.Employee;
import com.example.crud.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

	EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService, EmployeeServiceImpl employeeServiceImpl){
		this.employeeService = employeeService;
	}
	
//	Use if u are sending request using raw(JSON, XML, Plain text, etc)
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
//	Use if u are sending request using x-www-form-urlencoded
	//@PostMapping
//	public Employee createEmployeeForm(@ModelAttribute Employee employee) {
//		return employeeService.saveEmployee(employee);
//	}
//	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		return employeeService.updateEmployee(id, employee);
	}
	
	@PatchMapping("/{id}")
	public Employee updateEmployeePartially(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
		return employeeService.updateEmployeePartially(id, updates);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployeeById(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}
	
}
