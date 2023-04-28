package com.project1.service;

import com.project1.module.Customer;

public interface CustomerService {
	Customer customerSignUp(Customer c);
	
	Customer customerLogin(String data,String cpasswrod);
}
