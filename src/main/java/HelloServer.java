import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;
import java.util.Enumeration;
import static java.lang.System.*;
import java.io.IOException;

public class HelloServer extends AbstractHandler {
    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException{

        response.setContentType("text/html;chatset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);


        String html="<!DOCTYPE html>\n"+
                "<html>\n" +
                "<head>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"C:\\Users\\Ilya\\Desktop\\main.css\"/>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Hello Server</h1>\n"+
                "<h2>Files</h2>\n" +
                "<p>Pictures</p>\n" +
                "</body>\n" +
                "</html>";
        response.getWriter().println(html);
        response.getWriter().println("<img src=\"resources/day-2-grivni-2-768x578.jpg\"/>\n" );


    }
}
