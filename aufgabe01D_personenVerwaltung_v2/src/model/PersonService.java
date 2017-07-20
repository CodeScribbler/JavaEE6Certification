package model;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private List<Person> personList = new ArrayList<>();


    public List<Person> getPersonList() {
        return personList;
    }


    private static PersonService instance = new PersonService();

    public static PersonService getInstance() {
        return instance;
    }

    private PersonService() {
    }
}
