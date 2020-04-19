
package action;

import java.util.ArrayList;
import java.util.List;

import beans.UserInfo;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.UserInfoInterface;
import dao.UserInfoInterfaceImplement;



public class UserInfoAction extends ActionSupport implements ModelDriven<UserInfo>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserInfo userInfo = new UserInfo();
    private List<UserInfo>listUserInfo=new ArrayList<UserInfo>();
    
    UserInfoInterface userInfoInterface=new UserInfoInterfaceImplement();
    @Override
    public UserInfo getModel()
    {
      return userInfo;
    }
    
    public String saveUserInfo()
    {
    	userInfoInterface.saveUser(userInfo);
    	return SUCCESS;
    }
	public String listUsers()
	{
		listUserInfo=userInfoInterface.getAllUser();
		return SUCCESS;
		
	}

	
	public UserInfo getUserInfo()
	{
	
		return userInfo;
	}

	
	public void setUserInfo(UserInfo userInfo)
	{
	
		this.userInfo = userInfo;
	}

	
	public List<UserInfo> getListUserInfo()
	{
	
		return listUserInfo;
	}

	
	public void setListUserInfo(List<UserInfo> listUserInfo)
	{
	
		this.listUserInfo = listUserInfo;
	}


}
