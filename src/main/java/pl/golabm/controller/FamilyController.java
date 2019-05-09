package pl.golabm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.golabm.dto.FamilyDTO;
import pl.golabm.model.Child;
import pl.golabm.model.Family;
import pl.golabm.model.FamilyMember;
import pl.golabm.service.ChildService;
import pl.golabm.service.FamilyMemberService;
import pl.golabm.service.FamilyService;

@RestController
@RequestMapping("/family")
public class FamilyController {

    private final FamilyService familyService;
    private final FamilyMemberService familyMemberService;
    private final ChildService childService;

    @Autowired
    FamilyController(final FamilyService familyService, final FamilyMemberService familyMemberService, final ChildService childService) {
        this.familyService = familyService;
        this.familyMemberService = familyMemberService;
        this.childService = childService;
    }

    @PostMapping
    public Family save(@RequestBody FamilyDTO familyDTO) {
        final Family family = familyDTO.toEntity();
        familyService.save(family);
        for (FamilyMember familyMember : family.getFamilyMembers()) {
            familyMember.setFamily(family);
            familyMemberService.save(familyMember);
        }
        for (Child child: family.getChildList()) {
            child.setFamily(family);
            childService.save(child);
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        for (FamilyMember familyMember : familyService.getById(id).getFamilyMembers()) {
            familyMemberService.delete(familyMember.getId());
        }
        for (Child child: familyService.getById(id).getChildList()) {
            childService.delete(child.getId());
        }
        familyService.delete(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public Iterable<Family> getAll() {
        return familyService.getAll();
    }

    @PutMapping(value = "/{id}")
    public Family update(@PathVariable Long id, @RequestBody FamilyDTO familyDTO) {
        final Family family = familyDTO.toEntity();
        return familyService.update(id, family);
    }
}
