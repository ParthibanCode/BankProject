package com.example.bank.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.entity.Account;
import com.example.bank.service.IAccountService;

@RestController
public class AccountController {
	
	@Autowired
	private IAccountService accountService;
	
	@PostMapping("/account/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addAccount(@RequestBody @Valid Account account, @PathVariable("id") Integer id) throws NotFoundException {
		accountService.createAccount(account, id);
	}

}
