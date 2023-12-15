package br.com.entidadejava.timetracker.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class TimeEntry {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String category;
  private String description;
  private byte hours;
  @OneToOne(cascade = CascadeType.ALL)
  private Project project;
  @OneToOne(cascade = CascadeType.ALL)
  private UserProject user;

  protected TimeEntry() {
  }

  public TimeEntry(String category, String description, byte hours, Project project,
      UserProject user) {
    this.category = category;
    this.description = description;
    this.hours = hours;
    this.project = project;
    this.user = user;
  }

  public Long getId() {
    return id;
  }

  public String getCategory() {
    return category;
  }

  public String getDescription() {
    return description;
  }

  public byte getHours() {
    return hours;
  }

  public Project getProject() {
    return project;
  }

  public UserProject getUser() {
    return user;
  }
}
