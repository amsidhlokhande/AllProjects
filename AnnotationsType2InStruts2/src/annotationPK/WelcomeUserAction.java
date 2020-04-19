package annotationPK;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action (value="welcome-user",results={@Result(name="SUCCESS",location="/results/welcome.jsp")})

public class WelcomeUserAction
{
	private static final long serialVersionUID = 1L;
     
	private String userName;

	private String message="No User";

	public String execute() {

		message = "Welcome " + userName;
        if(!userName.equalsIgnoreCase("amsidh"))
        {
        	return "FAIL";
        }
		return "SUCCESS";

	}

	public void setUserName(String userName) {

		this.userName = userName;

	}

	public void setMessage(String message) {

		this.message = message;

	}

	public String getUserName() {

		return userName;

	}

	public String getMessage() {

		return message;

	}

}