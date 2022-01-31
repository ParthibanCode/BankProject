package com.example.bank.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.AccountRepository;
import com.example.bank.CustomerRepository;
import com.example.bank.entity.Account;
import com.example.bank.entity.Customer;

@Service
public class IAccountService {
	
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	CustomerRepository customerRepository;
	
	public void createAccount(@Valid Account account, Integer id) {
		Customer customer = customerRepository.findById(id).get();
		customer.setAccount(account);
		
		accountRepository.save(account);
		customerRepository.save(customer);
		
	}

}
