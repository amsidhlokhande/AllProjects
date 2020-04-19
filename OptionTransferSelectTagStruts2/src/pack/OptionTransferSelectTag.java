package pack;

import com.opensymphony.xwork2.ActionSupport;

public class OptionTransferSelectTag extends ActionSupport
{
	private static final long serialVersionUID = 1L;
    
	private String []selectedLanguage;
	public String[] getSelectedLanguage()
	{
		return selectedLanguage;
	}
	public void setSelectedLanguage(String[] selectedLanguage)
	{
		for(String langs:selectedLanguage)
		{
			System.out.println(langs);
		}
		this.selectedLanguage = selectedLanguage;
	}
	
    
}