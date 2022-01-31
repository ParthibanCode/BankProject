package com.example.bank.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bank.TranscationRepo;

public class ITransactionService {
	
	@Autowired
	TranscationRepo transactionRepository;
	
	

}
