/**
 * 
 */
package com.amsidh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.dtos.Vechile;
import com.amsidh.mvc.dtos.VechileDaoImpl;

/**
 * @author amsidhlokhande
 * 
 */
public class JdbcWithSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		VechileDaoImpl vechileDao = context.getBean("vechileDao",
				VechileDaoImpl.class);
		Vechile vechile = vechileDao.getVechileByVechileId(1);
		System.out.println(vechile.getVechileType());

	}

}
