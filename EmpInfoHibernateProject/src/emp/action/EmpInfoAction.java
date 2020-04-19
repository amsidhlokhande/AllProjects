package emp.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import emp.dao.EmpInfoDAO;
import emp.dao.EmpInfoDaoImpl;
import emp.domain.EmpInfo;

public class EmpInfoAction extends ActionSupport implements
		ModelDriven<EmpInfo>
{
	private Long empcode;
	private String empfullname;
	private String empdepartment;
	private String empemailid;
	private Long empmobilenumber;
	private String username;
	private String password;

	private static final long serialVersionUID = 1L;
	private List<EmpInfo> listEmp = new ArrayList<EmpInfo>();
	private EmpInfo empInfo = new EmpInfo();
	EmpInfoDAO empInfoDao = new EmpInfoDaoImpl();

	@Override
	public String execute()
	{

		return "SUCCESS";
	}

	public String addEmpInfo()
	{
		System.out.println(empInfo.getEmpcode());
		empInfoDao.saveEmpInfo(empInfo);
		return "SUCCESS";
	}

	public String listEmpInfo()
	{
		this.listEmp = empInfoDao.getEmpInfoList();
		return "SUCCESS";
	}

	@Override
	public EmpInfo getModel()
	{

		return empInfo;
	}

	public List<EmpInfo> getListEmp()
	{
		return this.listEmp;
	}

	public void setListEmp(List<EmpInfo> listEmp)
	{
		this.listEmp = listEmp;
	}

	public EmpInfo getEmpInfo()
	{
		return this.empInfo;
	}

	public void setEmpInfo(EmpInfo empInfo)
	{
		this.empInfo = empInfo;
	}

}
