package cn.gogotanc.jetty;

import cn.gogotanc.jetty.controller.MainController;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Hello jetty!
 */
public class App {
  public static void main(String[] args) throws Exception {

    Server server = new Server(9000);
    ServletContextHandler contextHandler = new ServletContextHandler(server, "/");
    contextHandler.addServlet(MainController.class, "/index");
    server.setHandler(contextHandler);
    server.start();
    server.join();
  }
}
