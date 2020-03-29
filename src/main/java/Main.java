
import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import javax.servlet.ServletException;

        import java.io.IOException;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
        import org.eclipse.jetty.server.Request;
        import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.session.SessionHandler;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        SessionHandler sessionHandler = new SessionHandler();
        SessionNotifier sessionNotifier = new SessionNotifier();
        sessionHandler.setHandler(sessionNotifier);

        Server server = new Server(8420);
         //server.setHandler(sessionHandler);

        ContextHandler ch=new ContextHandler();
        ch.setContextPath("/resources");
        ResourceHandler resource_handler = new ResourceHandler();
        resource_handler.setDirectoriesListed(true);
        resource_handler.setResourceBase("C:\\Users\\Ilya\\Downloads\\springboot\\java2\\src\\main\\resources");
        ch.setHandler(resource_handler);
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { ch, sessionHandler});
        server.setHandler(handlers);

        server.start();
        server.join();
    }
}