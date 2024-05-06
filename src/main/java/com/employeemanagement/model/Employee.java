package com.employeemanagement.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	@Column(name = "employee_id")
	Long employeeId;
	
	@Column(name = "employee_name")
	String employeeName;

	@Column(name = "salary")
	Long salary;
	
	@Column(name = "department_id")
	private String department_id;
	
	@ManyToOne
	@JoinColumn(name="department_id", insertable = false, updatable = false)
	@JsonIgnore
	Department department;
	
	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

}
