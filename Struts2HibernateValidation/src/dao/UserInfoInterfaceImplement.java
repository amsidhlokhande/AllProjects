package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import beans.UserInfo;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;


public class UserInfoInterfaceImplement implements UserInfoInterface
{
	@SessionTarget 
    Session session;
    
	
    @TransactionTarget
    Transaction transaction;
    
	@Override
	public void saveUser(UserInfo userInfo)
	{
        
		try
		{
          session.save(userInfo);			
 		}catch(Exception ex)
		{
			transaction.rollback();
			ex.printStackTrace();
		}
 	// TODO Auto-generated method stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserInfo> getAllUser()
	{
        List<UserInfo> list=session.createQuery("from UserInfo").list();  
		// TODO Auto-generated method stub
		return list;
	}
  
}
