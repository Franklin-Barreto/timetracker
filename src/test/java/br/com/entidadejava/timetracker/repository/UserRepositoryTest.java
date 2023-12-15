package br.com.entidadejava.timetracker.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.entidadejava.timetracker.model.Project;
import br.com.entidadejava.timetracker.model.UserProject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class UserRepositoryTest {

  @Autowired
  UserRepository userRepository;
  @Autowired
  ProjectRepository projectRepository;

  @Test
  void saveUserProject() {
    final Project project = projectRepository.save(new Project("timetracker", (byte) 8));
    UserProject user = userRepository.save(new UserProject("Joao", project));
    assertEquals("Joao", user.getName());
    assertEquals(1, user.getProject().getId());
    assertEquals(8, user.getProject().getTotalHours());
  }
}
