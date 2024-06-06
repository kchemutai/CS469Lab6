package miu.edu.ADS.service;

import miu.edu.ADS.model.Surgery;

import java.util.List;


public interface SurgeryService {

	Integer createNewSurgery(Surgery surgery);
	
	List<Surgery> findAppointment();
}
