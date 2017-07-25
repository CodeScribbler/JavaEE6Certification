package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Person;
import model.PersonService;

public class PersonSaveAction implements Action  {

    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        Person person = new Person(firstname, lastname);

        // 2. Modellaufruf
        PersonService.getInstance().save(person);
        // new PersonService().save(person)

        // 3.

        String info = String.format("Person [%s] wurde angelegt.", person);
        request.setAttribute("info", info);
        request.getRequestDispatcher("/personCreate.jsp").forward(request, response);

    }



}
