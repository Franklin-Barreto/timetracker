package br.com.entidadejava.timetracker.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import br.com.entidadejava.timetracker.controller.dto.ProjectDto;
import br.com.entidadejava.timetracker.controller.dto.ProjectResponseDto;
import br.com.entidadejava.timetracker.service.ProjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ProjectController.class)
class ProjectControllerTest {

  @Autowired
  private MockMvc mockMvc;
  @MockBean
  private ProjectService projectService;

  @Test
  void saveProject() throws Exception {

    when(projectService.save(new ProjectDto("WorkStand", (byte) 8))).thenReturn(
        new ProjectResponseDto(1L, "WorkStand", (byte) 8));
    String projectJson = "{ \"name\": \"WorkStand\", \"dailyHoursLimit\": 8 }";
    String url = "/projects";
    mockMvc.perform(post(url).contentType(MediaType.APPLICATION_JSON)
            .content(projectJson))
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.dailyHoursLimit").value(8));
  }
}
