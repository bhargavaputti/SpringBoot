package com.example.crud.service;

import java.util.List;
import java.util.Map;

import com.example.crud.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	Employee getEmployeeById(Long id);
	Employee updateEmployee(Long id, Employee employee);
	Employee updateEmployeePartially(Long id,  Map<String, Object> updates);
	void deleteEmployee(Long id);
	List<Employee> getAllEmployees();
	
}
