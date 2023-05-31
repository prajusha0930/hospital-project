package com.example.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cruddemo.model.Address;
//import com.example.cruddemo.model.Patientdetails;
import com.example.cruddemo.repository.Addressrepository;
import com.example.cruddemo.repository.Patientdetailsrepository;

@Service
public class PatientdetailsService {

	@Autowired
	Patientdetailsrepository pr;
	
	@Autowired
	Addressrepository ar;
	
	public List<Address> getDetails() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}
	
	public Address postDetails(Address id)
	{
		return ar.save(id);
	}

	
}
