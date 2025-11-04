package com.example.crud.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.crud.entity.Employee;
import com.example.crud.exception.EmployeeNotFound;
import com.example.crud.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		try {
			return employeeRepository.findById(id)
					.orElseThrow(() -> new EmployeeNotFound("Employee not found with id: " + id));
		} catch (EmployeeNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		Employee existing = getEmployeeById(id);
		if (existing != null) {
			existing.setName(employee.getName());
			existing.setEmail(employee.getEmail());
			existing.setMobile(employee.getMobile());
			existing.setAddress(employee.getAddress());
			return employeeRepository.save(existing);
		}
		return null;
	}

	@Override
	public void deleteEmployee(Long id) {
//		Employee employee = getEmployeeById(id);
//		employeeRepository.delete(employee);
//		return employee;

		employeeRepository.deleteById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployeePartially(Long id, Map<String, Object> updates) {
		Employee existing = getEmployeeById(id);
		System.out.println("in service: "+existing);
		if (existing != null) {
//			******Old way without using forEach loop*******
//			System.out.println("Map "+updates);
//			for (String key : updates.keySet()) {
//				System.out.println("key is "+key);
//				switch (key) {
//				case "name" -> existing.setName(String.valueOf(updates.get(key)));
//				case "email" -> existing.setEmail(String.valueOf(updates.get(key)));
//				case "mobile" -> existing.setMobile(String.valueOf(updates.get(key)));
//				case "address" -> existing.setAddress(String.valueOf(updates.get(key)));
//				}
//			}
			
			updates.forEach((key, value) -> {
		        switch (key) {
		            case "name" -> existing.setName(String.valueOf(updates.get(key)));
		            case "email" -> existing.setEmail(String.valueOf(updates.get(key)));
		            case "mobile" -> existing.setMobile(String.valueOf(updates.get(key)));
		            case "address" -> existing.setAddress(String.valueOf(updates.get(key)));
		            default -> throw new IllegalArgumentException("Invalid field: " + key);
		        }
		    });
			return employeeRepository.save(existing);
		}
		return null;

	}

}
