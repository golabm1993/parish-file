package pl.golabm.repository;

import org.springframework.data.repository.CrudRepository;
import pl.golabm.model.Child;

public interface ChildRepository extends CrudRepository<Child, Long> {
}
