package com.capg.ApplicationATM.serviceImpl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ApplicationATM.entity.Account;
import com.capg.ApplicationATM.entity.Transaction;
import com.capg.ApplicationATM.repository.AccountRepo;
import com.capg.ApplicationATM.repository.TransactionRepo;
import com.capg.ApplicationATM.service.TransactionService;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired 
	private TransactionRepo transactionrepo;
	
	@Autowired
	private AccountRepo accountrepo;

	@Override
	public void createTransaction(int accountId, double amount, String type) throws Exception {
		try {
			Transaction transaction = new Transaction();
			transaction.setTransactionAmount(amount);
			transaction.setTransactionType(type);
			Date now = Calendar.getInstance().getTime();
			transaction.setTransactionDate(now);
			Account account = accountrepo.findById(accountId).get();
			transaction.setAccountNo(account.getAccountNo());
			transaction.setAccount(account);
			transactionrepo.save(transaction);
		}catch(Exception e) {
			log.error(e.getMessage());
		}
	}

	@Override
	public List<Transaction> displayAllTransaction() {
		return transactionrepo.findAll();
	}

	@Override
	public List<Transaction> getByIdTransaction(int accountId) {
		List<Transaction> transaction = transactionrepo.findAll();
		return transaction.stream().filter(x->x.getAccount().getAccountId() == accountId).collect(Collectors.toList());
	}
}
