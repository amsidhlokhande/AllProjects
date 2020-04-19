package com.amsidh.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.amsidh.beans.Patient;
import com.amsidh.dao.PatientDao;
import com.amsidh.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService
{
	
	private PatientDao patientDao;

	@Override
	public void addPatient(Patient patient)
	{
		patientDao.addPatient(patient);

	}

	@Override
	public void updatePatient(Patient patient)
	{
		patientDao.updatePatient(patient);

	}

	@Override
	public void removePatient(Integer patId)
	{
		patientDao.removePatient(patId);

	}

	@Override
	public Patient searchPatient(Integer patId)
	{
		return patientDao.searchPatient(patId);

	}

	@Override
	public List<Patient> getAllPatient()
	{
		return patientDao.getAllPatient();
	}

	
	@PostConstruct
	public void init()
	{
		System.out.println("PatientDaoImpl method executed");
	}

	public void setPatientDao(PatientDao patientDao)
	{
		this.patientDao = patientDao;
	}
}
