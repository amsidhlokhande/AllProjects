package pack;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CountryApplicationListener implements ServletContextListener
{

  public void contextDestroyed(ServletContextEvent servletContextEvent)
  {
    servletContextEvent = null;

  }

  public void contextInitialized(ServletContextEvent servletContextEvent)
  {
    Map<Integer, String> countries = new HashMap<Integer, String>();
    countries.put(1, "US");
    countries.put(2, "Canada");
    countries.put(3, "Mexico");
    ServletContext servletContext = servletContextEvent.getServletContext();
    servletContext.setAttribute("countries", countries);
  }
}
