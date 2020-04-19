/**
 * 
 */
package com.main.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.amsidh.dtos.FourWheeler;
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
      session.beginTransaction();
      Vechile vechile = new Vechile();
      vechile.setVechileName("Car");
      
      TwoWheeler twoWheeler=new TwoWheeler();
      twoWheeler.setVechileName("Bike");
      twoWheeler.setSteringHandler("Stering Handler");
      
      FourWheeler fourWheeler=new FourWheeler();
      fourWheeler.setVechileName("Pouche");
      fourWheeler.setSteringWheel("Stering Wheel");
      
      session.save(vechile);
      session.save(twoWheeler);
      session.save(fourWheeler);
      session.getTransaction().commit();
      session.close();
      
      
	}

}
