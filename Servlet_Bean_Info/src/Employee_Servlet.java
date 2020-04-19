import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

public class Employee_Servlet extends HttpServlet 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
        Employee emp=new Employee();
     	try
     	{
     		BeanUtils.populate(emp, req.getParameterMap());
     		System.out.println(emp.getEmpCode());
     		System.out.println(emp.getEmpName());
     		System.out.println(emp.getDepartment());
     		System.out.println(emp.getJoiningDate());
     		ServletContext context=req.getSession().getServletContext();
     		context.setAttribute("emp", emp);
     		RequestDispatcher rd=req.getRequestDispatcher("display");
     		rd.forward(req, resp);
     	}catch(Exception ex)
     	{
     		ex.printStackTrace();
     	}
    } 
}
