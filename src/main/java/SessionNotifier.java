import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class SessionNotifier extends AbstractHandler {

   public void handle(String url_path, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
           throws IOException, ServletException {
        response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("<h1>Hello Server</h1>");

        PrintWriter writer = response.getWriter();

        //1
        HttpSession session = request.getSession();
        writer.println(session.getId());

        //2
       /*session.setAttribute("sId", session.getId());
       session.setAttribute("name", "Chelovek");

       Enumeration<String> attributes = session.getAttributeNames();
       while(attributes.hasMoreElements()){
           writer.println(attributes.nextElement());
       }*/

       //3
       /*if(session.isNew()){
           writer.println("Session is new");
       } else writer.println("Session is old");*/

       //4
       /*HttpSession session = request.getSession();
       writer.println(session.getId());

       if(session.isNew()){
           writer.println("Session is new");
       } else writer.println("Session is old");*/
    }

}
