package com.employeemanagement.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.employeemanagement.model.Department;
import com.employeemanagement.model.Employee;
import com.employeemanagement.repository.DepartmentRepository;
import com.employeemanagement.repository.EmployeeRepository;
import com.employeemanagement.service.EmployeeManagementApiService;

@Service
public class EmployeeManagementApiServiceImpl implements EmployeeManagementApiService{
	
	private final DepartmentRepository departmentRepository;
	private final EmployeeRepository employeeRepository;
	
	public EmployeeManagementApiServiceImpl (final DepartmentRepository departmentRepository, 
			final EmployeeRepository employeeRepository) {
		this.departmentRepository = departmentRepository;
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployeesByDepartment(final String departmentId) {
		//List<Employee> employees = new 
//		Department department = departmentRepository.findById(departmentId).orElseThrow(() -> new RuntimeException());
//		List<Employee> employees = List.copyOf(department.getEmployees());
		List<Employee> employees = new ArrayList<Employee>();
//		Set<Employee> employeesSet = new HashSet<>();
		
		List<Department> departmentList = departmentRepository.findByDepartmentName(departmentId);
		if(!CollectionUtils.isEmpty(departmentList)) {
			employees.addAll(departmentRepository.findByDepartmentName(departmentId).get(0).getEmployees());
		}
//		List<Set<Employee>> employeeSetList = departmentList.stream().map(dept -> dept.getEmployees()).toList();
//		 for(Set<Employee> x : employeeSetList) {
//			 employeesSet.addAll(x);
//		 }
//		 
//		 employees.addAll(employeesSet);
		
		return employees;
	}

	@Override
	public List<Employee> getAllEmployeesWithSalaryGreaterThanAmountEntered(Long amount) {
		List<Employee> employees = employeeRepository.findAll().stream().filter(emp -> emp.getSalary() > amount).toList();
		return employees;
	}

	@Override
	public List<Employee> getAllEmployeesWithAssociatedDepartment() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

}
