package com.example.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.CustomerRepository;
import com.example.bank.entity.Customer;

@Service
public class ICustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public void createCustomer(Customer customer){
		customerRepository.save(customer);
	}

}
