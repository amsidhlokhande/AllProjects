package pack;

import com.opensymphony.xwork2.ActionSupport;

public class DoubleSelectTag extends ActionSupport
{
	private static final long serialVersionUID = 1L;
    private String[] country;
    private String[] cities;
	public String[] getCountry()
	{
		return country;
	}
	public void setCountry(String[] country)
	{
		for(String c:country)
		{
			System.out.println(c);
		}
		this.country = country;
	}
	public String[] getCities()
	{
		return cities;
	}
	public void setCities(String[] cities)
	{
		for(String city:cities)
	    {
			System.out.println(city);
	    }
		this.cities = cities;
	}
    
}