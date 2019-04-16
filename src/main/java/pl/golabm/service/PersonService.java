package pl.golabm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.golabm.model.Person;
import pl.golabm.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public void delete(Long id) {
        personRepository.deleteById(id);
    }

    public List<Person> getAllPersons() {
        return (List<Person>) personRepository.findAll();
    }

    public Optional<Person> getOnePerson(Long id) {
        return personRepository.findById(id);
    }

    public Person update(Long id, Person newPerson) {
        Optional<Person> oldPerson = getOnePerson(id);
        Person person = oldPerson.get();
        person.setFirstName(newPerson.getFirstName());
        person.setLastName(newPerson.getLastName());
        person.setAddress(newPerson.getAddress());
        person.setPhoneNumber(newPerson.getPhoneNumber());
        person.setFamilyMemberType(newPerson.getFamilyMemberType());
        return personRepository.save(person);
    }
}
