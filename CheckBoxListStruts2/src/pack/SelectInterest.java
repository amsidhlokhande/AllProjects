package pack;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class SelectInterest extends ActionSupport
{
	private static final long serialVersionUID = 1L;
    private int[] interest;
    
    private List<Interest> interests;
	
	public List<Interest> getInterests()
	{
		interests=new ArrayList<Interest>();
		interests.add(new Interest(0,"Bangalore"));
		interests.add(new Interest(1,"Mumbai"));
		interests.add(new Interest(2,"Delhi"));
		interests.add(new Interest(3,"Chennai"));
		interests.add(new Interest(4,"Kolkata"));
		
		return interests;
	}
	
	public int[] getInterest()
	{
		return interest;
	}

	public void setInterest(int[] interest)
	{
		for(int s:interest)
		{
			System.out.println(s);
		}
		this.interest = interest;
	}

	public void setInterests(List<Interest> interests)
	{
		this.interests = interests;
	}
    
}

class Interest
{
	private int id;
	private String description;
	public Interest()
	{
		
	}
	public Interest(int id,String description)
	{
		this.id=id;
		this.description=description;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
		
	
}