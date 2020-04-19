package pack;

import com.opensymphony.xwork2.ActionSupport;

public class UpDownloadSelectOptionStruts2 extends ActionSupport
{
	private static final long serialVersionUID = 1L;
    private String []colors;
	public String[] getColors()
	{
		return colors;
	}
	public void setColors(String[] colors)
	{
		for(String i:colors)
		{
			System.out.println(i);
		}
		this.colors = colors;
	}
	
}