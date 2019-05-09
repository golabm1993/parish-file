package pl.golabm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.golabm.dto.ChildDTO;
import pl.golabm.model.Child;
import pl.golabm.service.ChildService;

@RestController
@RequestMapping("/child")
public class ChildController {

    private final ChildService childService;

    @Autowired
    ChildController(final ChildService childService) {
        this.childService = childService;
    }

    @PostMapping("/{id}")
    public Child save(@PathVariable Long id, @RequestBody ChildDTO childDTO) {
        final Child child = childDTO.toEntity();
        return childService.saveToExistingFamily(id, child);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        childService.delete(id);
    }

    @PutMapping("/{id}")
    public Child update(@PathVariable Long id, @RequestBody ChildDTO childDTO) {
        final Child child = childDTO.toEntity();
        final Child childToUpdate = childService.getById(id);
        Long familyId = childToUpdate.getFamily().getId();
        return childService.update(id, child, familyId);
    }
}
