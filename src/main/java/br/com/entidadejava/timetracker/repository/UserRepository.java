package br.com.entidadejava.timetracker.repository;

import br.com.entidadejava.timetracker.model.UserProject;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserProject, Long> {

}
