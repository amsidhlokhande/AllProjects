import java.sql.Connection;
import java.sql.DriverManager;



public class OracleDatabase
{
   public void connection()
   {
	   Connection con=null;
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","amsidhl","********");
		   System.out.println("Connected to Oracle Database");
		   
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }finally
	   {
		   try
		   {
			   con.close();
		   }catch(Exception ee)
		   {
			   ee.printStackTrace();
		   }
	   }
   }
   public static void main(String arg[])
   {
	  new OracleDatabase().connection(); 
   }
}
