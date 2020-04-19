package pack;

public class HelloStruts2 {

	private String userName="gdgf";
	private String password="gfdg";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if (userName.length() > 0 && userName.equals("amsidhlokhande")
				&& password.length() > 0) {
			return "SUCCESS";
		} else {
			return "INPUT";
		}
	}
}
