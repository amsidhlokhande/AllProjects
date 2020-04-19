package operation ;

import org.springframework.context.ApplicationContext ;
import org.springframework.context.support.ClassPathXmlApplicationContext ;

public class SimpleOperator
{

  private SimpleOpratorImpl operator ;
  private int      a ;
  private int      b ;

  public void execute ( )
  {
	System.out.println ( "Addition=" + operator.add ( a , b ) ) ;
	System.out.println ( "Substraction=" + operator.sub ( a , b ) ) ;
	System.out.println ( "Multiplication=" + operator.mul ( a , b ) ) ;
	System.out.println ( "Division=" + operator.div ( a , b ) ) ;

  }

  public void setOperator ( SimpleOpratorImpl operator )
  {
	this.operator = operator ;
  }

  public synchronized void setA ( int a )
  {
	this.a = a ;
  }

  public synchronized void setB ( int b )
  {
	this.b = b ;
  }

  public static void main ( String arg[] )
  {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext ( "/operation/config.xml" ) ;
	SimpleOperator simpleOperator = ( SimpleOperator )applicationContext.getBean ( "simpleOperatorBean" ) ;
	simpleOperator.execute ( ) ;

  }
}
