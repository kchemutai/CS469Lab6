package miu.edu.ADS.service;


import miu.edu.ADS.model.Patient;

public interface PatientService {

	Integer createNewPatient(Patient patient);
	
	Patient findPatientById(Integer patientId);
	
	Patient updateExistingPatient(Patient patient);
	
	Integer deletePatient(Integer patientId);
}
