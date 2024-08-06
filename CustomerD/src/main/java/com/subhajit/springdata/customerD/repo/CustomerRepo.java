package com.subhajit.springdata.customerD.repo;

import org.springframework.data.repository.CrudRepository;

import com.subhajit.springdata.customerD.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
