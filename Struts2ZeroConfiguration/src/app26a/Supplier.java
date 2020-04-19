package app26a;

import org.apache.struts2.config.Namespace;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.xwork2.ActionSupport;

@Results({
		@Result(name = "success", value = "/success.jsp", type = ServletDispatcherResult.class),
		@Result(name = "error", value = "/Error.jsp", type = ServletDispatcherResult.class) })
		@Namespace (value="/")
public class Supplier extends ActionSupport
{
	private String name;

	public String execute()
	{
		if (name == null || name.length() < 4)
		{
			return ERROR;
		} else
		{
			return SUCCESS;
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	} 
	
}
