package br.com.entidadejava.timetracker.repository;

import br.com.entidadejava.timetracker.model.TimeEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeEntryRepository extends CrudRepository<TimeEntry, Long> {

}
