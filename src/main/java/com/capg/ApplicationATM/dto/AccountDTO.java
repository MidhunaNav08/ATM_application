package com.capg.ApplicationATM.dto;

import lombok.Data;

@Data
public class AccountDTO {
	private int accountId;
	private String accountName;
	private int accountNo;
	private String username;
	private String password;
	private double balance;
}
