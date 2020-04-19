package pack;

public class Demo {
   
	
	public void display() throws Exception
		{
			try
			{
				System.out.println("Inner Class");
				return ;
			}catch(Exception ex)
			{
				throw new Exception();
			}
			finally
			{
				System.out.println("Finnaly");
			}
		}
	
	public static void main(String arg[])throws Exception 
   {
	    System.out.println("Hello World");
	    new Demo().display();
	    
   }
	
}

class myException extends Exception{
	public void display()
	{
		
	}
}
