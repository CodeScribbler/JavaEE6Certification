package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Person;
import model.PersonService;

public class PersonDeleteAction implements Action {

    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.
        Long id  = Long.parseLong(request.getParameter("id"));

        // 2. Modellaufruf
        PersonService personService = PersonService.getInstance();
        Person personDeleted = personService.delete(id);
        // new PersonService().save(person)

        // 3.

        String info = String.format("Person [%s] wurde gelöscht.", personDeleted);
        request.setAttribute("info", info);

        // Personenliste anzeigen
//    new PersonListAction().execute(request, response);
        request.getRequestDispatcher("/FrontController?todo=personList").forward(request, response);

    }



}
