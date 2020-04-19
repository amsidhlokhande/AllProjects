package hello;

public class HelloWorld {
	private String userName;
	private String message;

	public HelloWorld() {
      this.message="Invalid User";
	}

	public String execute() {
        this.userName=getUserName();
        if(userName.equalsIgnoreCase("amsidh"))
        {
         this.message="Hi! "+userName;	
		 return "success";
        }else
        {
        	return "failed";
        }
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
