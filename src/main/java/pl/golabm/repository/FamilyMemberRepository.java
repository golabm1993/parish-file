package pl.golabm.repository;

import org.springframework.data.repository.CrudRepository;
import pl.golabm.model.Family;
import pl.golabm.model.FamilyMember;

public interface FamilyMemberRepository extends CrudRepository<FamilyMember, Long> {

    void deleteByFamily(Family family);
}
