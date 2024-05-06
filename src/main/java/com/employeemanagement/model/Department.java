package com.employeemanagement.model;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name="DEPARTMENT")
public class Department {

	@Id
	@Column(name = "department_id")
	private Long departmentId;

	@Column(name = "department_name")
	private String departmentName;
	
	@OneToMany (mappedBy = "department_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Employee> employees = new LinkedHashSet<>();
	
	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}
