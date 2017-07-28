package controller.topic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import view.Topic;


public interface TopicGenerator {
    Topic getTopic(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
