package pk;

import org.apache.struts2.config.Action;
import org.apache.struts2.config.Namespace;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;

import com.opensymphony.xwork2.ActionSupport;

@Namespace(value = "/")
@Action(name = "login")
@Results(
		  { 
			@Result(name = "success", value = "/success.jsp"),
		    @Result(name = "input", value = "/Login.jsp") 
		  }
		)
		
public class Login extends ActionSupport
{
	private String userName;
	private String password;

	public Login()
	{

	}

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

	@Override
	public String execute() throws Exception
	{
		System.out.println("Execute method here...");
		return "success";
	}

}
