/**
 * 
 */
package com.amsidh.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.amsidh.mvc.dtos.UserDetails;
import com.amsidh.mvc.dtos.UserId;



/**
 * @author VIRU
 *
 */
public class HibernateUtil {
	
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		UserDetails user=new UserDetails(new UserId(new Integer(1),"amsidh.lokhande"),"amsidh.lokhande@accenture.com");
		
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		
		user=null;
		
		session=sessionFactory.openSession();
		session.beginTransaction();
		user=(UserDetails)session.get(UserDetails.class, new UserId(1,"amsidh.lokhande"));
		System.out.println("User Name: "+user.getUserId().getUserName());
	}

}
