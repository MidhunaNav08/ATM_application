package com.capg.ApplicationATM.service;

import java.util.List;

import com.capg.ApplicationATM.entity.Transaction;

public interface TransactionService {
	void createTransaction(int accountId, double amount, String type) throws Exception;
	List<Transaction> displayAllTransaction();	
	List<Transaction> getByIdTransaction(int accountId);
}
