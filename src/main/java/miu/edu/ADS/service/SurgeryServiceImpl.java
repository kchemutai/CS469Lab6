package miu.edu.ADS.service;

import java.util.List;

import miu.edu.ADS.model.Surgery;
import miu.edu.ADS.repository.SurgeryRepository;
import miu.edu.ADS.service.SurgeryService;
import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class SurgeryServiceImpl implements SurgeryService {
	
	private final SurgeryRepository surgeryRepository;
	
	@Override
	public Integer createNewSurgery(Surgery surgery) {
	log.info("A new Surgery with id=" + surgery.getId() + " will be created!");
	
	surgeryRepository.save(surgery);
	
	log.info("The Surgery with id=" + surgery.getId() + " is created!");
	
	return surgery.getId();
	}

	@Override
	public List<Surgery> findAppointment() {
		return surgeryRepository.findAll();
	}

}
