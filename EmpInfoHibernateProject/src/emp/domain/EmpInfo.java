package emp.domain;

/**
 * Empinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class EmpInfo implements java.io.Serializable
{

	// Fields

	private Long empcode;
	private String empfullname;
	private String empdepartment;
	private String empemailid;
	private Long empmobilenumber;
	private String userName;
	private String password;

	// Constructors

	/** default constructor */
	public EmpInfo()
	{
	}

	/** minimal constructor */
	public EmpInfo(Long empcode)
	{
		this.empcode = empcode;
	}

	/** full constructor */
	public EmpInfo(Long empcode, String empfullname, String empdepartment,
			String empemailid, Long empmobilenumber, String username,
			String password)
	{
		this.empcode = empcode;
		this.empfullname = empfullname;
		this.empdepartment = empdepartment;
		this.empemailid = empemailid;
		this.empmobilenumber = empmobilenumber;
		this.userName = username;
		this.password = password;
	}

	// Property accessors

	public Long getEmpcode()
	{
		return this.empcode;
	}

	public void setEmpcode(Long empcode)
	{
		this.empcode = empcode;
	}

	public String getEmpfullname()
	{
		return this.empfullname;
	}

	public void setEmpfullname(String empfullname)
	{
		this.empfullname = empfullname;
	}

	public String getEmpdepartment()
	{
		return this.empdepartment;
	}

	public void setEmpdepartment(String empdepartment)
	{
		this.empdepartment = empdepartment;
	}

	public String getEmpemailid()
	{
		return this.empemailid;
	}

	public void setEmpemailid(String empemailid)
	{
		this.empemailid = empemailid;
	}

	public Long getEmpmobilenumber()
	{
		return this.empmobilenumber;
	}

	public void setEmpmobilenumber(Long empmobilenumber)
	{
		this.empmobilenumber = empmobilenumber;
	}

	public String getUsername()
	{
		return this.userName;
	}

	public void setUsername(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

}