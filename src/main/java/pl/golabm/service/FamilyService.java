package pl.golabm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.golabm.model.Family;
import pl.golabm.repository.FamilyRepository;

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

    public Family getById(Long id) {
        return familyRepository.findById(id).get();
    }

    public Family update(Long id, Family family) {
        family.setId(id);
        return familyRepository.save(family);
    }

    public Family findBySurname(String surname) {
        return familyRepository.findBySurname(surname);
    }
}
