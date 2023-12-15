package br.com.entidadejava.timetracker.service;

import br.com.entidadejava.timetracker.controller.dto.ProjectDto;
import br.com.entidadejava.timetracker.controller.dto.ProjectResponseDto;
import br.com.entidadejava.timetracker.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

  private final ProjectRepository projectRepository;

  @Autowired
  public ProjectService(ProjectRepository projectRepository) {
    this.projectRepository = projectRepository;
  }

  public ProjectResponseDto save(ProjectDto project){
    return ProjectResponseDto.fromEntity(projectRepository.save(project.toEntity()));
  }

}
