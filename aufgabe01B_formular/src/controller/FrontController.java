package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FC")
public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>FrontController</title></head>");
        out.println("<body>");
        out.println("<h1>FrontController in Action</h1>");
        out.println("Vorname: " + request.getParameter("firstname") + "<br/>");
        out.println("Nachname: "+  request.getParameter("lastname") + "<br/>");
        out.println("</body>");
        out.println("</html>");
    }

}
