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
//import com.capg.ApplicationATM.exception.InsufficentException;
//import com.capg.ApplicationATM.repository.AccountRepo;
//
//import lombok.extern.slf4j.Slf4j;
//
//@ExtendWith(MockitoExtension.class)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@Slf4j
//public class WithdrawServiceTest {
//
//	@Mock
//	private WithdrawService withdrawservice;
//	
//	@Mock
//	private AccountRepo accountrepo;
//	
//	@BeforeAll
//	void setup() {
//		log.info("---------------------Start of Withdraw Service Test---------------------");
//	}
//	
//	@AfterAll
//	void end() {
//		log.info("---------------------End of Withdraw Service Test---------------------");
//	}
//	
//	@Test
//	void testWithdrawAmount() throws InsufficentException {
//		Account account =  new Account(1,"Tom",1234,"tomH@123","password",900.0,null);
//		accountrepo.save(account);
//		withdrawservice.withdrawAmount(1, 200);
//		verify(withdrawservice).withdrawAmount(1, 200);
//		log.info("Withdraw service test successfull");
//	}
//}
