//package pl.golabm.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import pl.golabm.dto.PersonDTO;
//import pl.golabm.model.Person;
//import pl.golabm.service.PersonService;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class PersonController {
//
//    private final PersonService personService;
//
//    @Autowired
//    PersonController(PersonService personService) {
//        this.personService = personService;
//    }
//
//    @PostMapping
//    public Person save(@RequestBody PersonDTO personDTO) {
//        Person person = personDTO.toEntity();
//        return personService.save(person);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        personService.delete(id);
//    }
//
//    @GetMapping
//    public List<Person> getAllPerson() {
//        return personService.getAllPersons();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Person> getOnePerson(@PathVariable Long id) {
//        return personService.getOnePerson(id);
//    }
//
//    @PutMapping("/{id}")
//    public Person update(@PathVariable Long id, @RequestBody PersonDTO personDTO) {
//        Person person = personDTO.toEntity();
//        return personService.mapOldToNewPerson(id, person);
//    }
//}
