package com.dprod.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
	private String empName;

	// duplicate project will not assigned to employee therefore Set is taken

	@ManyToMany
	@JoinTable(name = "employee_project",
		joinColumns =  @JoinColumn(name = "employee_id"),
		inverseJoinColumns = @JoinColumn(name = "project_id")
			)
	private Set<Project> assignProjects = new HashSet<>();

	public Employee() {
		
	}

	public Employee(long empId, String empName, Set<Project> assignProjects) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.assignProjects = assignProjects;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Set<Project> getAssignProjects() {
		return assignProjects;
	}

	public void setAssignProjects(Set<Project> assignProjects) {
		this.assignProjects = assignProjects;
	}
	
}
