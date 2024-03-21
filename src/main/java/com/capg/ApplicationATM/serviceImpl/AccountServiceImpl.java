package com.capg.ApplicationATM.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ApplicationATM.entity.Account;
import com.capg.ApplicationATM.exception.IncorrectLoginCredentialsException;
import com.capg.ApplicationATM.repository.AccountRepo;
import com.capg.ApplicationATM.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accountrepo;

	@Override
	public void addaccount(Account account) throws Exception {
		try {
			accountrepo.save(account);
		} catch (Exception e) {
			log.error(e.getMessage());
		}

	}

	@Override
	public List<Account> displayAllAccount() throws Exception {
		try {
			return accountrepo.findAll();
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return null;
	}
	
	@Override
	public double getBalance(int accountId) throws Exception {
		try {
			Account account = accountrepo.findById(accountId).get();
			return account.getBalance();
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return 0;
	}

	@Override
	public Account getAccountById(int accountId) {
		return accountrepo.findById(accountId).get();
	}

	@Override
	public Account login(String username, String password) throws IncorrectLoginCredentialsException {
		Account a = accountrepo.findByUsername(username);
		log.info(a.getUsername());
		log.info(a.getPassword());
		try {
			if(a.getUsername().equals(username) && a.getPassword().equals(password)) {
				return a;
			}
			else {
				throw new IncorrectLoginCredentialsException("Login credentials are incorrect!");
			}
		}
		catch(Exception e) {
			log.error(e.getMessage());
		}
		return null;
	}
}
