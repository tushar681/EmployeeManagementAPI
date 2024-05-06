package com.employeemanagement.service;

import java.util.List;

import com.employeemanagement.model.Employee;

public interface EmployeeManagementApiService {

	List<Employee> getAllEmployeesByDepartment(final String departmentId);
	
	List<Employee> getAllEmployeesWithSalaryGreaterThanAmountEntered(final Long amount);
	
	List<Employee> getAllEmployeesWithAssociatedDepartment();
	
}
