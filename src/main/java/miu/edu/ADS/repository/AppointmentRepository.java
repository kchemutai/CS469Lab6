package miu.edu.ADS.repository;

import miu.edu.ADS.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
