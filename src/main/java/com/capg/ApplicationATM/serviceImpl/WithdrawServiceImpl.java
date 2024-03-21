package com.capg.ApplicationATM.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ApplicationATM.entity.Account;
import com.capg.ApplicationATM.exception.InsufficentException;
import com.capg.ApplicationATM.repository.AccountRepo;
import com.capg.ApplicationATM.service.TransactionService;
import com.capg.ApplicationATM.service.WithdrawService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WithdrawServiceImpl implements WithdrawService{
	
	@Autowired
	private AccountRepo accountrepo;

	@Autowired
	private TransactionService transactionservice;
	
	@Override
	public double withdraw(int accountId, double amount) throws InsufficentException {
		try {
			Account account = accountrepo.findById(accountId).get();
			if(account.getBalance() < amount) {
				throw new InsufficentException("Insufficent Balance");
			}
			else {
				account.setBalance(account.getBalance() - amount);
				accountrepo.save(account);
				transactionservice.createTransaction(accountId, amount, "WITHDRAW");
				return account.getBalance();
			}
		}catch(Exception e) {
			log.error(e.getMessage());
		}
		return 0;
	}

	
}
