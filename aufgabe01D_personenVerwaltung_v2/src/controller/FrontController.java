package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {

    @Override
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // http://localhost:8080/aufgabe01C/PersonController?todo=...

        String todo = request.getParameter("todo");
        if (todo == null) {
            todo = "";
        }
        Action action = null;
        switch (todo) {
            case "personList":
                action = new PersonListAction();
                break;
            case "personSave":
                action = new PersonSaveAction();
                break;
            case "personDelete":
                action = new PersonDeleteAction();
                break;
            case "personEdit":
                action = new PersonEditAction();
                break;
            case "personUpdate":
                action = new PersonUpdateAction();
                break;
            default:
                action = new UnknownAction();
        }
        action.execute(request, response);
    }

}










