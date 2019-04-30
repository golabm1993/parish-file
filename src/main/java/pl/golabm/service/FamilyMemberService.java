package pl.golabm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.golabm.model.Family;
import pl.golabm.model.FamilyMember;
import pl.golabm.repository.FamilyMemberRepository;
import pl.golabm.repository.FamilyRepository;

import java.util.Optional;

@Service
public class FamilyMemberService {

    private final FamilyMemberRepository familyMemberRepository;
    private final FamilyRepository familyRepository;

    @Autowired
    FamilyMemberService(final FamilyMemberRepository familyMemberRepository, final FamilyRepository familyRepository) {
        this.familyMemberRepository = familyMemberRepository;
        this.familyRepository = familyRepository;
    }

    public FamilyMember save(FamilyMember familyMember) {
        return familyMemberRepository.save(familyMember);
    }

    public FamilyMember saveToExistingFamily(Long familyId, FamilyMember familyMember) {
        familyMember.setFamily(familyRepository.findById(familyId).get());
        return familyMemberRepository.save(familyMember);
    }

    public void delete(Long id) {
        familyMemberRepository.deleteById(id);
    }

    public void deleteByFamily(Family family) {
        familyMemberRepository.deleteByFamily(family);
    }

    public Iterable<FamilyMember> getAll() {
        return familyMemberRepository.findAll();
    }

    public Optional<FamilyMember> getById(Long id) {
        return familyMemberRepository.findById(id);
    }

    public FamilyMember update(Long id, FamilyMember familyMember, Long familyId) {
        familyMember.setId(id);
        familyMember.setFamily(familyRepository.findById(familyId).get());
        return familyMemberRepository.save(familyMember);
    }
}
