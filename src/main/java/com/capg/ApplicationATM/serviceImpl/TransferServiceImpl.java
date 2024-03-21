package com.capg.ApplicationATM.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ApplicationATM.entity.Account;
import com.capg.ApplicationATM.exception.InsufficentException;
import com.capg.ApplicationATM.repository.AccountRepo;
import com.capg.ApplicationATM.service.TransactionService;
import com.capg.ApplicationATM.service.TransferService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TransferServiceImpl implements TransferService{
	
	@Autowired
	private AccountRepo accountrepo;
	
	@Autowired
	private TransactionService transactionservice;

	@Override
	public void transfer(int fromId, int toId, double amount) throws InsufficentException {
		try {
			Account fromAccount = accountrepo.findById(fromId).get();
			Account toAccount = accountrepo.findById(toId).get();
			if(fromAccount.getBalance() < amount ) {
				throw new InsufficentException("insufficent Balance");
			}
			else {
				fromAccount.setBalance(fromAccount.getBalance() - amount);
				toAccount.setBalance(toAccount.getBalance() + amount);
				accountrepo.save(fromAccount);
				accountrepo.save(toAccount);
				transactionservice.createTransaction(fromId, amount, "TRANSFER -");
				transactionservice.createTransaction(toId, amount, "TRANSFER +");
			}
		}catch(Exception e) {
			log.error(e.getMessage());
		}
		
	}

}
