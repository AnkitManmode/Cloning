package com.dprod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.dprod.entity.Project;


public  interface ProjectRepository  extends JpaRepository<Project, Long> {

	List<Project> findAllByProjectId(Long projectId);
}
