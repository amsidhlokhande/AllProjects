package Beans;

public class CurrencyConvertorBean
{
  
  private String ruppies;
  private String dollers;

public String getRuppies()
{
	
	ruppies=Integer.parseInt(dollers)*56.58+"";
	System.out.println("Ruppies="+ruppies);
	return ruppies;
}

public void setRuppies(String ruppies)
{

	this.ruppies = ruppies;
}

public String getDollers()
{
	
	dollers=Integer.parseInt(ruppies)/56.58+"";
	System.out.println("Doller="+dollers);
	return dollers;
}

public void setDollers(String dollers)
{
	this.dollers = dollers;
}
    
}
