//package com.capg.ApplicationATM.service;
//
//import static org.mockito.Mockito.verify;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.capg.ApplicationATM.entity.Account;
//import com.capg.ApplicationATM.repository.AccountRepo;
//
//import lombok.extern.slf4j.Slf4j;
//
//@ExtendWith(MockitoExtension.class)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@Slf4j
//public class AccountServiceTest {
//	
//	@Mock
//	AccountService accountservice;
//	
//	@Mock
//	private AccountRepo accountrepo;
//	
//	@BeforeAll
//	void setupAll() {
//		log.info("---------------------Start of Account Service---------------------");
//	}
//	
//	@AfterAll()
//	void afterAll() {
//		log.info("---------------------End of Account Service---------------------");
//	}
//	
//	@Test
//	void testAddAccount() throws Exception {
//		Account account = new Account(1,"Tom",1234,"tomH@123","password",900.0,null);
//		accountrepo.save(account);
//		accountservice.addAccount(account);
//		verify(accountservice).addAccount(account);
//		log.info("Add account Test Successfull");
//	}
//	
//	@Test
//	void testAllAccount() throws Exception {
//		accountservice.displayAllAccount();
//		verify(accountservice).displayAllAccount();
//		log.info("Display all account Test Successfull");
//	}
//	
//	@Test
//	void testCheckBalance() {
//		Account account = new Account(1,"Tom",1234,"tomH@123","password",900.0,null);
//		accountrepo.save(account);
//		accountservice.getBalance(1);
//		verify(accountservice).getBalance(1);
//		log.info("Check Balance Test Successfull");
//	}
//	
//	
//}
