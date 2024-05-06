package com.employeemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagement.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	List<Department> findByDepartmentName(String departmentName);
	
}
