package pl.golabm.repository;

import org.springframework.data.repository.CrudRepository;
import pl.golabm.model.Family;

public interface FamilyRepository extends CrudRepository<Family, Long> {
}
