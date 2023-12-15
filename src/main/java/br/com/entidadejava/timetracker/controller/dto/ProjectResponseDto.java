package br.com.entidadejava.timetracker.controller.dto;

import br.com.entidadejava.timetracker.model.Project;

public record ProjectResponseDto(Long id, String name, byte dailyHoursLimit) {

  public static ProjectResponseDto fromEntity(Project entity) {
    return new ProjectResponseDto(entity.getId(), entity.getName(), entity.getTotalHours());
  }
}
