package br.com.entidadejava.timetracker.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.entidadejava.timetracker.model.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ProjectRepositoryTest {

  @Autowired
  ProjectRepository projectRepository;

  @Test
  void saveProject(){

    Project project = projectRepository.save(new Project("timetracker",(byte) 8));
    assertEquals(8,project.getTotalHours());
  }
}
