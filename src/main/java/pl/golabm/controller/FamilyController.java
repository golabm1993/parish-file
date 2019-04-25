package pl.golabm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.golabm.dto.FamilyDTO;
import pl.golabm.model.Family;
import pl.golabm.service.FamilyService;

@RestController
@RequestMapping("/family")
public class FamilyController {

    private final FamilyService familyService;

    @Autowired
    FamilyController(final FamilyService familyService) {
        this.familyService = familyService;
    }

    @PostMapping
    public Family save(@RequestBody FamilyDTO familyDTO) {
        final Family family = familyDTO.toEntity();
        return familyService.save(family);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        familyService.delete(id);
    }

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
