package pack;

import org.springframework.context.ApplicationContext ;
import org.springframework.context.support.ClassPathXmlApplicationContext ;

public class Main
{
  public static void main(String arg[])
  {
     ApplicationContext applicationContext=new ClassPathXmlApplicationContext ("/pack/config.xml" );
     Magician magician=(Magician)applicationContext.getBean ( "myMagicBean" );
     magician.perform ( );
  }
}
