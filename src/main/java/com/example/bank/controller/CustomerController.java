package com.example.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.entity.Customer;
import com.example.bank.service.ICustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	ICustomerService customerService;
	
	@PostMapping("/customer")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createUser(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
		System.out.println(customer.getName());
	}

}
