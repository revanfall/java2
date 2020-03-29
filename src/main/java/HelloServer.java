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
            throws IOException, ServletException
    {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("<h1>Hello Server</h1>");

        PrintWriter writer = response.getWriter();

        //1
        /*Enumeration<String> names = request.getHeaderNames();
        while(names.hasMoreElements()){
            writer.println(names.nextElement());
        }*/

        //2
        //writer.println(baseRequest.getHttpFields());

        //3
        //writer.println(baseRequest.getMetaData());

        //4
        //response.sendRedirect("https://www.google.com");


    }}

