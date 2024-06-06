package com.cs489.service;

import miu.edu.ADS.model.Appointment;

import java.util.List;


public interface AppointmentService {

	Integer createNewAppointment(Appointment appointment);
	
	List<Appointment> findAppointment();
}
