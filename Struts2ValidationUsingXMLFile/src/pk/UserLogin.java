package pk;


import com.opensymphony.xwork2.ActionSupport;


public class UserLogin extends ActionSupport
{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	
	public String getUserName()
	{
	
		return userName;
	}
	
	public void setUserName(String userName)
	{
	
		this.userName = userName;
	}
	
	public String getPassword()
	{
	
		return password;
	}
	
	public void setPassword(String password)
	{
	
		this.password = password;
	}
	
   public String execute()
   {
	   return SUCCESS;
   }
}
