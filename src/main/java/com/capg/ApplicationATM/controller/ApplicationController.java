package com.capg.ApplicationATM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ApplicationATM.entity.Account;
import com.capg.ApplicationATM.entity.Transaction;
import com.capg.ApplicationATM.exception.IncorrectLoginCredentialsException;
import com.capg.ApplicationATM.exception.InsufficentException;
import com.capg.ApplicationATM.service.AccountService;
import com.capg.ApplicationATM.service.DepositService;
import com.capg.ApplicationATM.service.TransactionService;
import com.capg.ApplicationATM.service.TransferService;
import com.capg.ApplicationATM.service.WithdrawService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ApplicationController {

	@Autowired
	private AccountService accountservice;
	
	@Autowired
	private DepositService depositservice;
	
	@Autowired
	private WithdrawService withdrawservice;
	
	@Autowired
	private TransferService transferservice;
	
	@Autowired
	private TransactionService transactionservice;
	
	@PostMapping("/account")
	public void addAccount(@RequestBody Account account) throws Exception {
		accountservice.addaccount(account);
//		return "Account added successfully";
	}
		
	@GetMapping("/accounts")
	public List<Account> displayAllAccount() throws Exception{
		return accountservice.displayAllAccount();
	}
	
	@PostMapping("/login")
	public Account login(@RequestBody Account account) throws IncorrectLoginCredentialsException {
		return accountservice.login(account.getUsername(),account.getPassword());
	}
	
	@GetMapping("/checkBalance/{id}")
	public double checkBalance(@PathVariable int id) throws Exception {
		return accountservice.getBalance(id);		
	}
	
	@PutMapping("/deposit/{id}/{amount}")
	public double deposit(@PathVariable int id, @PathVariable double amount) throws Exception {
		return depositservice.addAmount(id, amount);	
	}
	
	@PutMapping("/withdraw/{id}/{amount}")
	public double withdraw(@PathVariable int id, @PathVariable double amount) throws InsufficentException {
		return withdrawservice.withdraw(id, amount);
	}
	
	@PostMapping("/transfer/{fromId}/{toId}/{amount}")
	public void transfer(@PathVariable int fromId, @PathVariable int toId, @PathVariable double amount) throws InsufficentException {
		transferservice.transfer(fromId, toId, amount);
//		return "Transfer Successfull";	
	}
	
	@GetMapping("/transactions")
	public List<Transaction> alltransaction(){
		return transactionservice.displayAllTransaction();
	}
	
	@GetMapping("/transaction/{id}")
	public List<Transaction> displayById(@PathVariable int id){
		return transactionservice.getByIdTransaction(id);
	}
}
