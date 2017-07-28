package controller;

import controller.topic.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import view.Topic;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String todo = request.getParameter("todo");
        todo = todo == null ? "" : todo;

        TopicGenerator topicGenerator = null;
        request.setAttribute("actualTodo", todo);
        switch (todo) {
            case "requestHeaders":
                topicGenerator = new RequestHeadersTopicGenerator();
                break;
            case "requestParameters":
                topicGenerator = new RequestParametersTopicGenerator();
                break;
            case "requestAttributes":
                topicGenerator = new RequestAttributeTopicGenerator();
                break;
            default:
                topicGenerator = new DefaultTopicGenerator();
        }

        Topic topic = topicGenerator.getTopic(request, response);
        request.setAttribute("topic", topic);
        request.getRequestDispatcher("/topicOutput.jsp").forward(request, response);
        // ### DONE ###
    }

}
