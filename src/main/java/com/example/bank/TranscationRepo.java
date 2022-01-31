package com.example.bank;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.entity.Transaction;

public interface TranscationRepo extends JpaRepository<Transaction, Integer> {

}
