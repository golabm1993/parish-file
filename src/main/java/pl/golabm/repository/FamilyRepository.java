package pl.golabm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.golabm.model.Family;

public interface FamilyRepository extends PagingAndSortingRepository<Family, Long> {
}
