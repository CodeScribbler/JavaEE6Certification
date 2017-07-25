package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Person;
import model.PersonService;

public class PersonUpdateAction implements Action {

    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.
        Long id = Long.parseLong(request.getParameter("id"));
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        Person newPerson = new Person(id, firstname, lastname);

        // 2. Modellaufruf
        PersonService personService = PersonService.getInstance();
        Person oldPerson = personService.update(newPerson);

        // 3.
        String info = String.format("Person [%s] wurde auf [%s] aktualisiert.", oldPerson, newPerson);
        request.setAttribute("info", info);

        request.getRequestDispatcher("/FrontController?todo=personList").forward(request, response);

    }

}
