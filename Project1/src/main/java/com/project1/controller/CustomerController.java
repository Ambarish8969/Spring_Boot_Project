package com.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.project1.module.Customer;
import com.project1.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;

	@PostMapping("/customersignup")
	ResponseEntity<Customer> customerSignUp(@RequestBody Customer c) {
		return new ResponseEntity<Customer>(service.customerSignUp(c), HttpStatus.CREATED);
	}

	@GetMapping("/customerlogin")
	ResponseEntity<Customer> customerLogin(@RequestHeader String data,@RequestHeader String cpassword) {
		return new ResponseEntity<Customer>(service.customerLogin(data, cpassword), HttpStatus.FOUND);
	}
}
