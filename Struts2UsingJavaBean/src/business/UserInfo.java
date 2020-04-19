
package business;

import com.opensymphony.xwork2.ActionSupport;

import model.User;

public class UserInfo extends ActionSupport
{

	private User user;

	public UserInfo()
	{
		
	}
	public String execute()
	{
		return SUCCESS;
	}
	public User getUser()
	{

		return user;
	}

	public void setUser(User user)
	{

		this.user = user;
	}

}
