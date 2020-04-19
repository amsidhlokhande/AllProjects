package operation;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pk.Employee;



public class OperateEmployee 
{
  public static void main(String []arg)throws Exception
  {
	  
	 Configuration cfg=new Configuration();
	 cfg.configure("Employee.cfg.xml");
	 SessionFactory sf=cfg.buildSessionFactory();
	 Session session=sf.openSession();
	 Transaction transaction=session.beginTransaction();
	 /*Employee emp=new Employee();
	 emp.setEmpCode(11921);
	 emp.setName("Amsidh Lokhande");
	 emp.setPosition("Sr.Software Engineer");
	 emp.setDepartment("Non Tandem");
	 SimpleDateFormat sdf=new SimpleDateFormat("DD/MM/yyyy");
	 Date date=sdf.parse("05/05/1983");
	 emp.setJoiningDate(date);
	 emp.setCurrentCtc(121.5);
	 //session.saveOrUpdate(new Employee(11927,"Amsidh B Lokhande","Software Engineer","Non Tandem",new Date(),4518.54));
	 session.saveOrUpdate(emp);
	 session.flush();
	 transaction.commit();
	 session.close();
*/
	/*// Employee emp=(Employee)session.load(Employee.class,new Integer(11921));
	 Employee emp=(Employee)session.get(Employee.class,new Integer(154));
	 System.out.println(emp.getEmpCode());
	 System.out.println(emp.getName());
	 System.out.println(emp.getPosition());
	 System.out.println(emp.getDepartment());
	 System.out.println(emp.getCurrentCtc());
	 System.out.println(emp.getJoiningDate());
	 session.close();*/
	 Employee emp=(Employee)session.get(Employee.class,new Integer(11921));
	 session.delete(emp);
	 session.close();
	 
  }
}
