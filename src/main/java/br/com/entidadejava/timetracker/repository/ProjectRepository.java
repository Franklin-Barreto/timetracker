package br.com.entidadejava.timetracker.repository;

import br.com.entidadejava.timetracker.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {

}
