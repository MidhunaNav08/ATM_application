package com.capg.ApplicationATM.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.capg.ApplicationATM.entity.Account;

import lombok.Data;

@Data
public class TransactionDTO {
	@DateTimeFormat(pattern="dd/MM/yyy")
	private Date transcationDate;
	private String transactionType;
	private double transactionAmount;
	private int accountNo;
	private Account account;
}
