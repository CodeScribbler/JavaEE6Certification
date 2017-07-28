package controller.topic;


import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import view.Topic;


public class RequestAttributeTopicGenerator implements TopicGenerator {

    @Override
    public Topic getTopic(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("info", "Some Info für den Footer");
        request.setAttribute("msg", "Hallo zusammen");

        Topic topic = new Topic("Request Attributes", "Attribute Name", "Attribute Value");

        Enumeration<String> attributeNames = request.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            String attributeValue = (String) request.getAttribute(attributeName);
            topic.addRow(attributeName, attributeValue);
        }
        return topic;
    }
}
