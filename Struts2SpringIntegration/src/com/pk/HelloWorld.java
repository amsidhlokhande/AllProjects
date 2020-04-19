
package com.pk;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport
{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Message;
    
	public String execute()
	{

		return SUCCESS;
	}

	public String getMessage()
	{

		return Message;
	}

	public void setMessage(String message)
	{

		Message = message;
	}

}
