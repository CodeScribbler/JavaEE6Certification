package controller.topic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import view.Topic;


public class RequestParametersTopicGenerator implements TopicGenerator {

    @Override
    public Topic getTopic(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Topic topic = new Topic("Request Parameters", "Parameter Name", "Parameter Value");

        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String parameterName : parameterMap.keySet()) {
            String[] parameterValues = request.getParameterValues(parameterName);

            topic.addRow(parameterName, Arrays.toString(parameterValues));

        }

        return topic;
    }
}