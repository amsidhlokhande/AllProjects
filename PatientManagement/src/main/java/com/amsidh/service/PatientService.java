package com.amsidh.service;

import java.util.List;

import com.amsidh.beans.Patient;

public interface PatientService
{
	public void addPatient(Patient patient);

	public void updatePatient(Patient patient);

	public void removePatient(Integer patId);

	public Patient searchPatient(Integer patId);

	public List<Patient> getAllPatient();

}
