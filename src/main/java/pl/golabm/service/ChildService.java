package pl.golabm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.golabm.model.Child;
import pl.golabm.repository.ChildRepository;
import pl.golabm.repository.FamilyRepository;

@Service
public class ChildService {

    private final ChildRepository childRepository;
    private final FamilyRepository familyRepository;

    @Autowired
    ChildService(final ChildRepository childRepository, final FamilyRepository familyRepository) {
        this.childRepository = childRepository;
        this.familyRepository = familyRepository;
    }

    public Child save(Child child) {
        return childRepository.save(child);
    }

    public Child saveToExistingFamily(Long familyId, Child child) {
        child.setFamily(familyRepository.findById(familyId).get());
        return childRepository.save(child);
    }

    public void delete(Long id) {
        childRepository.deleteById(id);
    }

    public Child update(Long id, Child child, Long familyId) {
        child.setId(id);
        child.setFamily(familyRepository.findById(familyId).get());
        return childRepository.save(child);
    }

    public Child getById(Long id) {
        return childRepository.findById(id).get();
    }
}
