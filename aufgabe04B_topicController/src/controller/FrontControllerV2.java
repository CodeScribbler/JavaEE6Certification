package controller;

import controller.topic.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import view.Topic;

/**
 *
 * @author Salah Lejmi <info@jexp.org>
 * @date 16.02.2017 - 09:10:03
 */
@WebServlet("/FrontControllerV2")
public class FrontControllerV2 extends HttpServlet {

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


        List<Topic> topicList = new ArrayList<>();
        String[] todoValues = request.getParameterValues("todo");
        for (String todoValue : todoValues) {
            request.setAttribute("actualTodo", todoValue);
            switch (todoValue) {
                case "requestParameters":
                    topicList.add(new RequestParametersTopicGenerator().getTopic(request, response));
                    break;
                case "requestHeaders":
                    topicList.add(new RequestHeadersTopicGenerator().getTopic(request, response));
                    break;
                case "requestAttributes":
                    topicList.add(new RequestAttributeTopicGenerator().getTopic(request, response));
                    break;
                default:
                    topicList.add(new DefaultTopicGenerator().getTopic(request, response));
            }
        }


        request.setAttribute("topicList", topicList);
        request.getRequestDispatcher("/topicList.jsp").forward(request, response);
        // ### DONE ###
    }

}
