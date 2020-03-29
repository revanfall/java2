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
       PrintWriter writer = response.getWriter();



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

        //1
        HttpSession session = request.getSession();
        writer.println(session.getId());
        if(session.isNew())
            writer.println("New Session");
        else writer.println("Old session");

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
