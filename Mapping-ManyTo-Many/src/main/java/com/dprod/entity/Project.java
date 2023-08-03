package com.dprod.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PROJECT")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long projectId;
	private String projectName;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "assignProjects" )
	private Set<Employee> employeeSet = new HashSet<>();
	
	public Project() {
		
	}

	public Project(long projectId, String projectName, Set<Employee> employeeSet) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employeeSet = employeeSet;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Set<Employee> getEmployeeSet() {
		return employeeSet;
	}

	public void setEmployeeSet(Set<Employee> employeeSet) {
		this.employeeSet = employeeSet;
	}

	
}
