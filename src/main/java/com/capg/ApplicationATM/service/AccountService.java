package com.capg.ApplicationATM.service;

import java.util.List;

import com.capg.ApplicationATM.entity.Account;
import com.capg.ApplicationATM.exception.IncorrectLoginCredentialsException;

public interface AccountService {
	
	void addaccount(Account account) throws Exception;
	Account login(String username, String password) throws IncorrectLoginCredentialsException;
	Account getAccountById(int accountId);
	List<Account> displayAllAccount() throws Exception;
	double getBalance(int accountId)throws Exception;
}
