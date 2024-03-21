package com.capg.ApplicationATM.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionId;
	
	@DateTimeFormat(pattern="dd/MM/yyy")
	private Date transactionDate;
	
	private String transactionType;
	private double transactionAmount;
	private int accountNo;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;
}
