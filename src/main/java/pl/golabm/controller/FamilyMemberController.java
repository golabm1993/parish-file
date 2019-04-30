package pl.golabm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.golabm.dto.FamilyMemberDTO;
import pl.golabm.model.FamilyMember;
import pl.golabm.service.FamilyMemberService;

@RestController
@RequestMapping("/familyMember")
public class FamilyMemberController {

    private final FamilyMemberService familyMemberService;

    @Autowired
    FamilyMemberController(final FamilyMemberService familyMemberService) {
        this.familyMemberService = familyMemberService;
    }

    @PostMapping("/{id}")
    public FamilyMember save(@PathVariable Long id, @RequestBody FamilyMemberDTO familyMemberDTO) {
        final FamilyMember familyMember = familyMemberDTO.toEntity();
        return familyMemberService.saveToExistingFamily(id, familyMember);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        familyMemberService.delete(id);
    }

    @PutMapping("/{id}")
    public FamilyMember update(@PathVariable Long id, @RequestBody FamilyMemberDTO familyMemberDTO) {
        final FamilyMember familyMember = familyMemberService.getById(id).get();
        final FamilyMember familyMemberToSave = familyMemberDTO.toEntity();
        Long familyId = familyMember.getFamily().getId();
        return familyMemberService.update(id, familyMemberToSave, familyId);
    }
}
