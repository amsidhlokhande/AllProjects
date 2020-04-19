package operate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import pk1.Games;
import pk2.Cick;
import pk2.Hollyball;



public class Operation
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("/Game.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       Games games=new Games();
       games.setGameName("BacketBall");
       games.setNumberOfLevels("24");
       games.setNumberOfPlayers("5");
       s.saveOrUpdate(games);
       
       Cick cricket=new Cick();
       cricket.setGameName("Cicket");
       cricket.setNumberOfLevels("2");
       cricket.setNumberOfPlayers("22");
       s.saveOrUpdate(cricket);
       
       Hollyball hb=new Hollyball();
       hb.setGameName("HollyBall");
       hb.setNumberOfLevels("2");
       hb.setNumberOfPlayers("20");
       s.saveOrUpdate(hb);
       t.commit();
       s.close();
       
       
	}
}
