package com.example.bank;

import org.springframework.data.repository.CrudRepository;

import com.example.bank.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
