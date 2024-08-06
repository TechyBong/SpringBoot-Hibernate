package com.subhajit.springdata.customerD;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.subhajit.springdata.customerD.entity.Customer;
import com.subhajit.springdata.customerD.repo.CustomerRepo;

@SpringBootTest
class CustomerDApplicationTests {
	
	@Autowired
	CustomerRepo repos;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		Customer customer=new Customer();
		customer.setId(1);
		customer.setName("Subhajit");
		customer.setEmail("su@gmail.com");
		
		repos.save(customer);
	}
	
	@Test
	public void testUpdate() {
		Customer customer=repos.findById(1).get();
		customer.setEmail("subhajit@gmail.com");
		repos.save(customer);
	}
	
	@Test
	public void testFind() {
		Customer customer=repos.findById(1).get();
		System.out.println(customer.getName());
	}
	
	@Test
	public void testExist() {
		System.out.println("Entry Exists >>> "+repos.existsById(1));
	}
	
	@Test
	public void testCount() {
		System.out.println("Entry Count >>> "+repos.count());
	}

}
