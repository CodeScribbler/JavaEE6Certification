package model;

import java.util.ArrayList;
import java.util.List;
import model.Person;

public class PersonService {

    private List<Person> personList;
    private Long nextId;

    //######################## Singleton (Design Pattern) ########################
    private static PersonService personService;

    private PersonService() {
        personList = new ArrayList<>();
        personList.add(new Person(1L, "Peter", "Schmidt"));
        personList.add(new Person(2L, "Hans", "Meyer"));
        personList.add(new Person(3L, "Thomas", "Arnold"));
        nextId = 4L;
    }

    public static PersonService getInstance() {
        if (personService == null) {
            personService = new PersonService();
        }
        return personService;
    }
    //############################################################################

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void save(Person person) {
        person.setId(nextId);
        nextId++;
        personList.add(person);
    }

    public Person delete(Long id) {
        Person person2Delete = getPersonById(id);
        personList.remove(person2Delete);
        return person2Delete;
    }

    public Person getPersonById(Long id) {
        Person dummy = new Person(id, null, null);
        int index = personList.indexOf(dummy);
        Person person = personList.get(index);
        return person;
    }

    public Person update(Person newPerson) {
        Long id = newPerson.getId();
        Person oldPerson = getPersonById(id);
        int index = personList.indexOf(oldPerson);
        personList.set(index, newPerson);
        return oldPerson;
    }

}
