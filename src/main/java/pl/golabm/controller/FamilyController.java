package pl.golabm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.golabm.dto.FamilyDTO;
import pl.golabm.model.Family;
import pl.golabm.model.FamilyMember;
import pl.golabm.service.FamilyMemberService;
import pl.golabm.service.FamilyService;

@RestController
@RequestMapping("/family")
public class FamilyController {

    private final FamilyService familyService;
    private final FamilyMemberService familyMemberService;

    @Autowired
    FamilyController(final FamilyService familyService, final FamilyMemberService familyMemberService) {
        this.familyService = familyService;
        this.familyMemberService = familyMemberService;
    }

    @PostMapping
    public Family save(@RequestBody FamilyDTO familyDTO) {
        Family family = familyDTO.toEntity();
        family = familyService.save(family);
        for (FamilyMember familyMember : family.getFamilyMembers()) {
            familyMember.setFamily(family);
            familyMemberService.save(familyMember);
        }
        return family;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long delete(@PathVariable Long id) {
        for (FamilyMember familyMember : familyService.getById(id).getFamilyMembers()) {
            familyMemberService.delete(familyMember.getId());
        }
        return familyService.delete(id);
    }

    @GetMapping()
    public Iterable<Family> getAll() {
        return familyService.getAll();
    }

    @PutMapping()
    public Family update(@RequestBody FamilyDTO familyDTO) {
        final Family family = familyDTO.toEntity();
        return familyService.update(family);
    }
}
