package controller.topic;

import controller.topic.TopicGenerator;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import view.Topic;

/**
 *
 * @author Salah
 */
public class DefaultTopicGenerator implements TopicGenerator {

    @Override
    public Topic getTopic(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Topic topic = new Topic(request.getAttribute("actualTodo") + ": NOT IMPLEMENTED YET", "NOT IMPLEMENTED YET", "NOT IMPLEMENTED YET");
        topic.addRow("NOT IMPLEMENTED YET", "NOT IMPLEMENTED YET");
        return topic;

    }

}