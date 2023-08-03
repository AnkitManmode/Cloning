package com.dprod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dprod.entity.Project;
import com.dprod.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public void saveProject(Project project) {
		projectRepository.save(project);
	}	
	
		public List<Project> getProjectDetails(Long projectId){
			if(null!=projectId) {
				return projectRepository.findAllByProjectId(projectId);
			}else {
				return projectRepository.findAll();
			}
			
		}
		public void deleteProject(Long projectId) {
			projectRepository.deleteById(projectId);
		}
	}

