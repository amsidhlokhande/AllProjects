package com.amsidh.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.amsidh.beans.Patient;
import com.amsidh.dao.PatientDao;
import com.amsidh.dom.PatientDom;
@Repository
public class PatientDaoImpl implements PatientDao
{
	
	private SessionFactory sessionFactory;

	@Override
	public void addPatient(Patient patient)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dtoToDom(patient));
		session.flush();
		transaction.commit();
		session.close();
	}

	@Override
	public void updatePatient(Patient patient)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(dtoToDom(patient));
		session.flush();
		transaction.commit();
		session.close();

	}

	@Override
	public void removePatient(Integer patId)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Patient patient = (Patient) session.get(PatientDom.class, patId);
		if (patient != null) session.delete(patient);
		session.flush();
		transaction.commit();
		session.close();

	}

	@Override
	public Patient searchPatient(Integer patId)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Patient patient = domToDto((PatientDom) session.get(PatientDom.class, patId));
		session.flush();
		transaction.commit();
		session.close();

		return patient;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> getAllPatient()
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Patient> listOfPatient = listOfPatient((List<PatientDom>) session.createQuery(
				"from com.amsidh.dom.PatientDom").list());
		session.flush();
		transaction.commit();
		session.close();

		return listOfPatient;
	}

	private Patient domToDto(PatientDom patientDom)
	{
		Patient patient = new Patient();
		patient.setPatId(patientDom.getPatId());
		patient.setPatName(patientDom.getPatName());
		patient.setPatAddress(patientDom.getPatAddress());
		patient.setPatMobileNumber(patientDom.getPatMobileNumber());
		patient.setDoctorName(patientDom.getDoctorName());
		patient.setProblemDescription(patientDom.getProblemDescription());
		patient.setDateOfAdmit(patientDom.getDateOfAdmit());
		patient.setDateOfDischarge(patientDom.getDateOfDischarge());
		return patient;
	}

	private PatientDom dtoToDom(Patient patient)
	{
		PatientDom patientDom = new PatientDom();
		patientDom.setPatId(patient.getPatId());
		patientDom.setPatName(patient.getPatName());
		patientDom.setPatAddress(patient.getPatAddress());
		patientDom.setPatMobileNumber(patient.getPatMobileNumber());
		patientDom.setDoctorName(patient.getDoctorName());
		patientDom.setProblemDescription(patient.getProblemDescription());
		patientDom.setDateOfAdmit(patient.getDateOfAdmit());
		patientDom.setDateOfDischarge(patient.getDateOfDischarge());
		return patientDom;
	}

	private List<Patient> listOfPatient(List<PatientDom> listOfPatientDom)
	{
		List<Patient> listOfPatient = new ArrayList<Patient>();
		for (PatientDom patientDom : listOfPatientDom)
		{
			listOfPatient.add(domToDto(patientDom));
		}
		return listOfPatient;
	}

	private List<PatientDom> listOfPatientDom(List<Patient> listOfPatient)
	{
		List<PatientDom> listOfPatientDom = new ArrayList<PatientDom>();
		for (Patient patient : listOfPatient)
		{
			listOfPatientDom.add(dtoToDom(patient));
		}
		return listOfPatientDom;
	}

	
	@PostConstruct
	public void init()
	{
		System.out.println("PatientDaoImpl method executed");
	}
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
}
