package emp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import emp.domain.EmpInfo;

public class EmpInfoDaoImpl implements EmpInfoDAO
{

	@SessionTarget
	Session session;
	@TransactionTarget
	Transaction transaction;

	@SuppressWarnings("unchecked")
	@Override
	public List<EmpInfo> getEmpInfoList()
	{
		List<EmpInfo> empInfoList = null;
		try
		{
			empInfoList = session.createQuery("from EmpInfo").list();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return empInfoList;
	}

	@Override
	public void saveEmpInfo(EmpInfo empInfo)
	{
		try
		{

			session.save(empInfo);
		}
		catch (Exception ex)
		{
			transaction.rollback();
			ex.printStackTrace();
		}

	}

}
