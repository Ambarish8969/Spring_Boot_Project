package com.project1.module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // Defines that a class can be mapped to a table.
@Data   // It will create the getters ,setters and toString() automatically(lombok).
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@Column(nullable = false)
	private String cname;
	@Column(nullable = false)
	private long cphno;
	@Column(nullable = false)
	private String cemail;
	private String cgender;
	@Column(nullable = false)
	private int cage;
	@Column(nullable = false)
	private String cbloodGroup;
	@Column(nullable = false)
	private String cpassword;
	@Column(nullable = false)
	private double cheight;
	@Column(nullable = false)
	private double cweight;
}
