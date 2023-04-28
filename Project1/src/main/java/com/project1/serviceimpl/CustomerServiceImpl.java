package com.project1.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.exceptions.InvalidCredentialsException;
import com.project1.module.Customer;
import com.project1.repo.CustomerRepo;
import com.project1.service.CustomerService;

@Service // to create the object of serviceimplementation.
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo repo;

	@Override
	public Customer customerSignUp(Customer c) {
		return repo.save(c);
	}

	@Override
	public Customer customerLogin(String data, String cpasswrod) {
		Customer c = repo.validate(data, data);
		if (c != null) {
			if (c.getCpassword().equals(cpasswrod)) {
				return c;
			} else {
				throw new InvalidCredentialsException();
			}
		} else {
			throw new InvalidCredentialsException();
		}

	}

}
