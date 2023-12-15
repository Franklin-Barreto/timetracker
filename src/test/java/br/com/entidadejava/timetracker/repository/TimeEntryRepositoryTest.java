package br.com.entidadejava.timetracker.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.entidadejava.timetracker.model.Project;
import br.com.entidadejava.timetracker.model.TimeEntry;
import br.com.entidadejava.timetracker.model.UserProject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class TimeEntryRepositoryTest {

  @Autowired
  TimeEntryRepository timeEntryRepository;
  @Autowired
  ProjectRepository projectRepository;
  @Autowired
  UserRepository userRepository;

  @Test
  void saveTimeEntry(){

    Project project = projectRepository.save(new Project("timetracker",(byte) 8));
    UserProject user = userRepository.save(new UserProject("Joao", project));
    TimeEntry timeEntry = timeEntryRepository.save(new TimeEntry("code review","reviewing task PAY-145",(byte)8,project,user));
    assertEquals("code review",timeEntry.getCategory());
  }
}
