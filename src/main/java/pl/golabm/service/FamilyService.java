package pl.golabm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.golabm.model.Family;
import pl.golabm.repository.FamilyRepository;

import java.util.Optional;

@Service
public class FamilyService {

    private final FamilyRepository familyRepository;

    @Autowired
    FamilyService(final FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    public Family save(Family family) {
        return familyRepository.save(family);
    }

    public void delete(Long id) {
        familyRepository.deleteById(id);
    }

    public Iterable<Family> getAll() {
        return familyRepository.findAll();
    }

    public Family update(Long id, Family family) {
        Optional<Family> oldFammily = familyRepository.findById(id);
        Family familyToUpdate = oldFammily.get();
        familyToUpdate.setSurname(family.getSurname());
        familyToUpdate.setAddress(family.getAddress());
        familyToUpdate.setPhoneNumber(family.getPhoneNumber());
        familyToUpdate.setFamilyMembers(family.getFamilyMembers());
        familyToUpdate.setChildList(family.getChildList());
        familyToUpdate.setLastPastoralVisit(family.getLastPastoralVisit());
        return familyRepository.save(familyToUpdate);
    }
}
