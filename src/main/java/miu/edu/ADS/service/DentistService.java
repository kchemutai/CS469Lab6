package miu.edu.ADS.service;


import miu.edu.ADS.model.Dentist;

public interface DentistService {

	Integer createNewDentist(Dentist dentist);
	
	Dentist findDentistById(Integer dentistId);
	
	Dentist updateExistingDentist(Dentist dentist);
	
	Integer deleteDentist(Integer dentistId);
}
