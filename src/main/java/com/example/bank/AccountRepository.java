package com.example.bank;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
