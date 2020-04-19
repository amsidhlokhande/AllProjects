
package pack;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class RegistrationAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;

	private String password;

	private String gender;

	private String about;

	private String country;

	private String []community;

	private ArrayList <CountryBean>countryList;

	private ArrayList <String>communityList;

	private boolean mailingList;

	public String populate()
	{
        countryList=new ArrayList<CountryBean>();
        countryList.add(new CountryBean(1,"INIDA"));
        countryList.add(new CountryBean(2,"PAKISTAN"));
        countryList.add(new CountryBean(3,"BANGLADESH"));
        countryList.add(new CountryBean(4,"SRI LANKA"));
        countryList.add(new CountryBean(5,"BHUTAN"));
        countryList.add(new CountryBean(6,"CHINA"));
        
        communityList=new ArrayList<String>();
        communityList.add("C");
        communityList.add("C++");
        communityList.add("JAVA");
        communityList.add("ASP");
        communityList.add("JSP");
        communityList.add("STRUTS");
        communityList.add("DOT NET");
        
        community=new String[]{"JAVA","STRUTS"};
        mailingList=true;
        
		return "populate";
	}

	public String register()
	{

		// connect to database and do other activity
		
        return ERROR;
		//return SUCCESS;
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

	public String getGender()
	{

		return gender;
	}

	public void setGender(String gender)
	{

		this.gender = gender;
	}

	public String getAbout()
	{

		return about;
	}

	public void setAbout(String about)
	{

		this.about = about;
	}

	public String getCountry()
	{

		return country;
	}

	public void setCountry(String country)
	{

		this.country = country;
	}

	public String[] getCommunity()
	{

		return community;
	}

	public void setCommunity(String[] community)
	{

		this.community = community;
	}

	public ArrayList getCountryList()
	{

		return countryList;
	}

	public void setCountryList(ArrayList countryList)
	{

		this.countryList = countryList;
	}

	public ArrayList getCommunityList()
	{

		return communityList;
	}

	public void setCommunityList(ArrayList communityList)
	{

		this.communityList = communityList;
	}

	public boolean isMailingList()
	{

		return mailingList;
	}

	public void setMailingList(boolean mailingList)
	{

		this.mailingList = mailingList;
	}

}
