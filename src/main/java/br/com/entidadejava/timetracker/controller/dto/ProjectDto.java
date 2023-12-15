package br.com.entidadejava.timetracker.controller.dto;

import br.com.entidadejava.timetracker.model.Project;

public record ProjectDto(String name, byte dailyHoursLimit) {

  public Project toEntity() {
    return new Project(name, dailyHoursLimit);
  }
}
