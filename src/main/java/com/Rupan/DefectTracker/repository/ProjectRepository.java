package com.Rupan.DefectTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rupan.DefectTracker.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
