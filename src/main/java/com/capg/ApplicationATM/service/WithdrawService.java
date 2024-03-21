package com.capg.ApplicationATM.service;

import com.capg.ApplicationATM.exception.InsufficentException;

public interface WithdrawService {
	double withdraw(int accountId, double amount) throws InsufficentException;
}
