/**
 * 
 */
package com.main.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.amsidh.dtos.TwoWheeler;
import com.amsidh.dtos.Vechile;

/**
 * @author amsidhlokhande
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
      Session session=sessionFactory.openSession();
      
     
      Vechile vechile = new Vechile();
      vechile.setVechileName("Car");
      
     TwoWheeler bike=new TwoWheeler();
     bike.setVechileName("Hond");
     bike.setSteringHandler("Stering Handler");
      
      session.beginTransaction();
      
      session.save(vechile);
      session.save(bike);
     // session.save(fourWheeler);
      
      session.getTransaction().commit();
      session.close();
      
      
	}

}
