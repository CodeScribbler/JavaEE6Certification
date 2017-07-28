package controller.topic;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import view.Topic;

/**
 *
 * @author Salah Lejmi <info@jexp.org>
 * @date 22.02.2017 - 14:54:51
 */
public class RequestHeadersTopicGenerator implements TopicGenerator {

    @Override
    public Topic getTopic(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Topic topic = new Topic("Request Headers", "Header Name", "Header Value");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            topic.addRow(headerName, headerValue);
        }
        return topic;
    }
}