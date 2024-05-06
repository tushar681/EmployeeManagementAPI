package com.employeemanagement.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.model.Employee;
import com.employeemanagement.service.EmployeeManagementApiService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/employeeManagement")
public class EmployeeManagementApiController {
	
	private final EmployeeManagementApiService employeeManagementApiService;
	
	public EmployeeManagementApiController (final EmployeeManagementApiService employeeManagementApiService) {
		this.employeeManagementApiService = employeeManagementApiService;
	}

	@GetMapping("/employeesByDepartmentId/{departmentName}")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Employee> getAllEmployeesByDepartment(final @PathVariable String departmentName){
	    return employeeManagementApiService.getAllEmployeesByDepartment(departmentName);
	}
	
	@GetMapping("/employeesWithSalaryGreaterThanAmountEntered/{amount}")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Employee> getAllEmployeesWithSalaryGreaterThanAmountEntered(final @PathVariable Long amount){
	    return employeeManagementApiService.getAllEmployeesWithSalaryGreaterThanAmountEntered(amount);
	}
	
	@GetMapping("/allEmployeesWithAssociatedDepartment")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Employee> getAllEmployeesWithAssociatedDepartment(){
	    return employeeManagementApiService.getAllEmployeesWithAssociatedDepartment();
	}
}
