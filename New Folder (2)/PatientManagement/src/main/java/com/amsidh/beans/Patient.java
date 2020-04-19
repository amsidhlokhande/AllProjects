package com.amsidh.beans;

import java.io.Serializable;
import java.util.Date;

public class Patient implements Serializable
{

	private static final long serialVersionUID = -9056341437871968853L;
    
	private Integer patId;
	private String patName;
	private String patAddress;
	private Integer patMobileNumber;
	private String doctorName;
	private String problemDescription;
	private Date dateOfAdmit;
	private Date dateOfDischarge;
    
	public Integer getPatId()
	{
		return patId;
	}

	public void setPatId(Integer patId)
	{
		this.patId = patId;
	}

	public String getPatName()
	{
		return patName;
	}
	public void setPatName(String patName)
	{
		this.patName = patName;
	}

	public String getPatAddress()
	{
		return patAddress;
	}

	public void setPatAddress(String patAddress)
	{
		this.patAddress = patAddress;
	}

	public Integer getPatMobileNumber()
	{
		return patMobileNumber;
	}

	public void setPatMobileNumber(Integer patMobileNumber)
	{
		this.patMobileNumber = patMobileNumber;
	}

	public String getDoctorName()
	{
		return doctorName;
	}

	public void setDoctorName(String doctorName)
	{
		this.doctorName = doctorName;
	}

	public String getProblemDescription()
	{
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription)
	{
		this.problemDescription = problemDescription;
	}

	public Date getDateOfAdmit()
	{
		return dateOfAdmit;
	}

	public void setDateOfAdmit(Date dateOfAdmit)
	{
		this.dateOfAdmit = dateOfAdmit;
	}

	public Date getDateOfDischarge()
	{
		return dateOfDischarge;
	}

	public void setDateOfDischarge(Date dateOfDischarge)
	{
		this.dateOfDischarge = dateOfDischarge;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

}
