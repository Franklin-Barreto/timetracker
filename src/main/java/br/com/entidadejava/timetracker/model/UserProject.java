package br.com.entidadejava.timetracker.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class UserProject {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @OneToOne(cascade = CascadeType.ALL)
  private Project project;

  protected UserProject() {
  }

  public UserProject(String name, Project project) {
    this.name = name;
    this.project = project;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Project getProject() {
    return project;
  }
}
