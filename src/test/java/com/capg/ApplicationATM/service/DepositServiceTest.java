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
//public class DepositServiceTest {
//	
//	@Mock
//	private DepositService depositservice;
//	
//	@Mock
//	private AccountRepo accountrepo;
//	
//	@BeforeAll()
//	void setup() {
//		log.info("---------------------Start of Deposit Service Test---------------------");
//	}
//	
//	@AfterAll
//	void end() {
//		log.info("---------------------End of Deposit Service Test---------------------");
//	}
//	
//	@Test
//	void testAddAmount() throws Exception {
//		Account account =  new Account(1,"Tom",1234,"tomH@123","password",900.0,null);
//		accountrepo.save(account);
//		depositservice.addamount(1, 200);
//		verify(depositservice).addamount(1,200);
//		log.info("Add Deposit test successfull");
//	}
//}
