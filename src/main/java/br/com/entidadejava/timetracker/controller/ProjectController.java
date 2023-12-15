package br.com.entidadejava.timetracker.controller;

import br.com.entidadejava.timetracker.controller.dto.ProjectDto;
import br.com.entidadejava.timetracker.controller.dto.ProjectResponseDto;
import br.com.entidadejava.timetracker.service.ProjectService;
import java.net.URI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/projects")
public class ProjectController {

  private final Logger log = LoggerFactory.getLogger(ProjectController.class);
  private final ProjectService projectService;

  @Autowired
  public ProjectController(ProjectService projectService) {
    this.projectService = projectService;
  }

  @PostMapping
  public ResponseEntity<ProjectResponseDto> save(@RequestBody ProjectDto project,
      UriComponentsBuilder uriBuilder) {
    try {
      log.info("creating a project with {}", project);
      final ProjectResponseDto projectResponseDto = projectService.save(project);

      URI uri = uriBuilder.path("/projects/{id}").buildAndExpand(projectResponseDto.id()).toUri();
      return ResponseEntity.created(uri).body(projectResponseDto);
    } catch (Exception e) {
      log.error("Something went wrong", e);
      return ResponseEntity.internalServerError().build();
    }
  }
}
