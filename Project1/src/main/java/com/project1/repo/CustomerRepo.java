package com.project1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project1.module.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	@Query(value = "select * from Customer where cemail=?1 or cname=?2", nativeQuery = true)
	Customer validate(String cemail, String cname);
}