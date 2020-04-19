package com.amsidh.app;

import com.amsidh.dao.CircleDao;
import com.amsidh.dao.impl.CircleDaoImpl;
import com.amsidh.model.Circle;

public class MainApp {
   public static void main(String[] args) {
	CircleDao circleDao=new CircleDaoImpl();
	Circle circle=circleDao.getCircle(1);
	System.out.println(circle.getName());
}
}
