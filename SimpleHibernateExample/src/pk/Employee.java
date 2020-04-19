package pk;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable
{
	private int empCode;
	private String name;
	private String position;
	private String department;
	private Date joiningDate;
	private double currentCtc;

	public Employee()
	{

	}
	public Employee(int empCode,String name,String position,String department,Date joiningDate,double currentCtc)
	{
		this.empCode=empCode;
		this.name=name;
		this.position=position;
		this.department=department;
		this.joiningDate=joiningDate;
		this.currentCtc=currentCtc;
	}

	public int getEmpCode()
	{
		return empCode;
	}

	public void setEmpCode(int empCode)
	{
		this.empCode = empCode;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public Date getJoiningDate()
	{
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate)
	{
		this.joiningDate = joiningDate;
	}

	public double getCurrentCtc()
	{
		return currentCtc;
	}

	public void setCurrentCtc(double currentCtc)
	{
		this.currentCtc = currentCtc;
	}

}
