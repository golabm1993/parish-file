package pl.golabm.repository;

import org.springframework.data.repository.CrudRepository;
import pl.golabm.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
