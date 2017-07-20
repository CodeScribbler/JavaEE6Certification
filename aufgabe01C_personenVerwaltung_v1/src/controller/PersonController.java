package controller;

import java.io.IOException;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Person;


@WebServlet("/pc")
public class PersonController extends HttpServlet {

    private List<Person> personList;

    @Override
    public void init() throws ServletException {
        personList = new ArrayList<>();
        personList.add(new Person("Peter","Schmidt"));
        personList.add(new Person("Hans","Meyer"));
        personList.add(new Person("Thomas","Arnold"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String todo = request.getParameter("todo");
        if (todo == null)
            todo = "";
        switch (todo) {
            case "personList":
                personList(request, response);
                break;
            case "personSave":
                personSave(request, response);
                break;
            default:
                throw new AssertionError();
        }
    }

    private void personList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. Request Parameter auslesen, konvertieren ...
        // 2. Modell aufrufen (machen wir selbst: siehe oben)
        //    List<Person> personList = personService.getPersonList();
        // 3. View
        request.setAttribute("personList", personList);
        request.getRequestDispatcher("/personList.jsp").forward(request, response);  // Forward (Weiterleitung)
    }


    void dummyPreparationForJSP(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Person> personList = (List<Person>) request.getAttribute("personList");
        for (Person person : personList) {
            out.println(person + "<br/>");
        }
    }

    private void personSave(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        Person person = new Person(firstname, lastname);
        // 2. und 3.   (Ausnahmsweise, machen wir Schritt Nr. 2 selbst)
        personList.add(person);

        String info = String.format("Person [%s] wurde angelegt.", person);
        request.setAttribute("info", info);
        request.getRequestDispatcher("personCreate.jsp").forward(request, response);
    }

}
