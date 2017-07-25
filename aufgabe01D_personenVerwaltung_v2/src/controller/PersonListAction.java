package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Person;
import model.PersonService;

public class PersonListAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aufgaben der Controller-Schicht:
        // 1. Request Parameter auslesen, konvertieren, validieren ...
        // 2. Modell aufrufen (machen wir selbst: siehe oben)
        PersonService personService = PersonService.getInstance();
        List<Person> personList = personService.getPersonList();
        // 3. View
        request.setAttribute("personList", personList);
        request.getRequestDispatcher("/personList.jsp").forward(request, response);  // Forward (Weiterleitung)
        // in der JSP (personList.jsp) wird die Personenliste so geholt: request.getAttribute("personList");
    }
}
