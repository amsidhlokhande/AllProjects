package com.amsidh.beans;

import java.io.Serializable;
import java.util.List;

public class Doctor implements Serializable
{
	private static final long serialVersionUID = 8693868125206561395L;

	private Integer docId;
	private String docName;
	private String docMobileNumber;
	private String specialization;
	private List<Patient> listOfPatient;

	public Integer getDocId()
	{
		return docId;
	}

	public void setDocId(Integer docId)
	{
		this.docId = docId;
	}

	public String getDocName()
	{
		return docName;
	}

	public void setDocName(String docName)
	{
		this.docName = docName;
	}

	public String getDocMobileNumber()
	{
		return docMobileNumber;
	}

	public void setDocMobileNumber(String docMobileNumber)
	{
		this.docMobileNumber = docMobileNumber;
	}

	public String getSpecialization()
	{
		return specialization;
	}

	public void setSpecialization(String specialization)
	{
		this.specialization = specialization;
	}

	public List<Patient> getListOfPatient()
	{
		return listOfPatient;
	}

	public void setListOfPatient(List<Patient> listOfPatient)
	{
		this.listOfPatient = listOfPatient;
	}

}
