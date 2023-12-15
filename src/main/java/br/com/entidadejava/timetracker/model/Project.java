package br.com.entidadejava.timetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private byte totalHours;

  protected Project() {
  }

  public Project(String name, byte totalHours) {
    this.name = name;
    this.totalHours = totalHours;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public byte getTotalHours() {
    return totalHours;
  }
}
