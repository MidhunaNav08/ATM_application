package com.capg.ApplicationATM.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ApplicationATM.entity.Account;
import com.capg.ApplicationATM.repository.AccountRepo;
import com.capg.ApplicationATM.service.DepositService;
import com.capg.ApplicationATM.service.TransactionService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepositServiceImpl implements DepositService {
	
	@Autowired
	private AccountRepo accountrepo;
	
	@Autowired
	private TransactionService transactionservice;

	@Override
	public double addAmount(int accountId, double amount) throws Exception {
		try {
			Account account = accountrepo.findById(accountId).get();
			account.setBalance(account.getBalance() + amount);
			accountrepo.save(account);
			transactionservice.createTransaction(accountId, amount, "DEPOSIT");
			return account.getBalance();
		}
		catch(Exception e) {
			log.error(e.getMessage());
		}
		return 0;
	}

}
