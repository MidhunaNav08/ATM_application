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
//public class TransferServiceTest {
//	
//	@Mock
//	private TransferService transferservice;
//	
//	@Mock
//	private AccountRepo accountrepo;
//	
//	@BeforeAll
//	void setup() {
//		log.info("---------------------Start of Transfer Service Test---------------------");
//	}
//	
//	@AfterAll
//	void end() {
//		log.info("---------------------End of Transfer Service Test---------------------");
//	}
//	
//	@Test
//	void testTransferAmount() throws Exception {
//		Account account =  new Account(1,"Tom",1234,"tomH@123","password",900.0,null);
//		accountrepo.save(account);
//		Account account2 =  new Account(2,"Alice",5678,"Alice@34","password",500.0,null);
//		accountrepo.save(account2);
//		transferservice.transferAmount(1, 2, 100);
//		verify(transferservice).transferAmount(1, 2, 100);
//		log.info("Transfer Service Test Successfull");
//	}
//}
