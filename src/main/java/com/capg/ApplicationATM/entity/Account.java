package com.capg.ApplicationATM.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;

	private String accountName;
	private int accountNo;
	private String username;
	private String password;
	private double balance;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy="account")
	private List<Transaction> Transaction;

	

}