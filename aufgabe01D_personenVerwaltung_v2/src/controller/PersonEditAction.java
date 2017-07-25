package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Person;
import model.PersonService;

public class PersonEditAction implements Action {

    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.
        Long id  = Long.parseLong(request.getParameter("id"));

        // 2. Modellaufruf
        PersonService personService = PersonService.getInstance();
        Person person2Edit = personService.getPersonById(id);

        // 3.
        request.setAttribute("person", person2Edit);
        request.getRequestDispatcher("/personUpdate.jsp").forward(request, response);

    }



}
