package business;

import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport
{
	
	private static final long serialVersionUID = 1L;
	private String message;
	public String execute()
	{
        this.message="I am inside the execute method";
		return "success";
	}
	public String add()
	{
		this.message="I am inside the add method";
		return "success";
	}
	public String update()
	{
		this.message="I am inside the update method";
		return "success";
	}
	public String delete()
	{
		this.message="I am inside the delete method";
		return "success";
	}
	
	public String getMessage()
	{
	
		return message;
	}
	
	public void setMessage(String message)
	{
	
		this.message = message;
	}
     
}
