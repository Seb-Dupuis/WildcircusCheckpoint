package fr.portfolio.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.portfolio.portfolio.entities.Project;



@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
    
}
