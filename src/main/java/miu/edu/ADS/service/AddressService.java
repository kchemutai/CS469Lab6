package miu.edu.ADS.service;

import miu.edu.ADS.model.Address;

import java.util.List;


public interface AddressService {

	Integer createNewAddress(Address address);
	
	List<Address> findAddresses();
}
