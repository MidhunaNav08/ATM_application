//package com.capg.ApplicationATM.controller;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.ArrayList;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.capg.ApplicationATM.entity.Account;
//import com.capg.ApplicationATM.service.AccountService;
//import com.capg.ApplicationATM.service.DepositService;
//import com.capg.ApplicationATM.service.TransactionService;
//import com.capg.ApplicationATM.service.TransferService;
//import com.capg.ApplicationATM.service.WithdrawService;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import lombok.extern.slf4j.Slf4j;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(ApplicationController.class)
//@Slf4j
//public class ApplicationControllerTest {
//
//	@Autowired
//	MockMvc mockMvc;
//
//	@MockBean
//	private AccountService accountservice;
//	
//	@MockBean
//	private DepositService depositservice;
//	
//	@MockBean
//	private WithdrawService withdrawservice;
//	
//	@MockBean
//	private TransferService transferservice;
//	
//	@MockBean
//	private TransactionService transactionservice;
//	
////	Account Controller Test
//	
//	@Test
//	public void testDisplayAllAccount() throws Exception {
//		Account account1 = new Account(1, "Tom", 1234, "tomH@123", "password", 900.0, null);
//		Account account2 = new Account(2, "Irene", 5678, "Irene@4", "password", 1000.0, null);
//		ArrayList<Account> listOfTestAccount = new ArrayList<>();
//		listOfTestAccount.add(account1);
//		listOfTestAccount.add(account2);
//		Mockito.doReturn(listOfTestAccount).when(accountservice).displayAllAccount();
//		String URI = "/allAccount";
//		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON);
//		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//		String expectedJson = this.mapToJson(listOfTestAccount);
//		String outputInJson = result.getResponse().getContentAsString();
//		assertThat(outputInJson).isEqualTo(expectedJson);	
//		log.info("Test Display All Account");
//	}
//	
//	@Test
//	public void testCheckBalance() throws Exception {
//		Account account = new Account(1, "Tom", 1234, "tomH@123", "password", 900.0, null);
//		Mockito.doReturn(account.getBalance()).when(accountservice).getBalance(Mockito.anyInt());
//		String URI = "/checkBalance/1";
//		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON);
//		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//		String expectedJson = this.mapToJson(account.getBalance());
//		String outputInJson = result.getResponse().getContentAsString();
//		assertThat(outputInJson).isEqualTo(expectedJson);
//		log.info("Check Balance");
//		
//	}
//	
////	Deposit Controller Test
//	
//	@Test
//	private void testAddAmount() throws Exception {
//		Account account = new Account(1, "Tom", 1234, "tomH@123", "password", 900.0, null);
//		Mockito.doReturn(account.getBalance()).when(depositservice).addamount(Mockito.anyInt(), Mockito.anyDouble());
//		String URI = "/deposit/1/200}";
//		RequestBuilder requestBuilder = MockMvcRequestBuilders.post(URI).accept(MediaType.APPLICATION_JSON);
//		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//		String expectedJson = this.mapToJson(account.getBalance());
//		String outputInJson = result.getResponse().getContentAsString();
//		assertThat(outputInJson).isEqualTo(expectedJson);
//		log.info("Deposit amount");
//	}
//	
////	Withdraw Controller Test
//	
//	@Test
//	private void testWithdrawAmount() throws Exception {
//		Account account = new Account(1, "Tom", 1234, "tomH@123", "password", 900.0, null);
//		Mockito.doReturn(account.getBalance()).when(withdrawservice).withdrawAmount(Mockito.anyInt(), Mockito.anyDouble());
//		String URI = "/withdraw/1/200";
//		RequestBuilder requestBuilder = MockMvcRequestBuilders.post(URI).accept(MediaType.APPLICATION_JSON);
//		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//		String expectedJson = this.mapToJson(account.getBalance());
//		String outputInJson = result.getResponse().getContentAsString();
//		assertThat(outputInJson).isEqualTo(expectedJson);
//		log.info("Withdraw amount");
//	}
//	
//
//	/**
//	 * Maps an Object into a JSON String. Uses a Jackson ObjectMapper.
//	 */
//	private String mapToJson(Object object) throws JsonProcessingException {
//		ObjectMapper objectMapper = new ObjectMapper();
//		return objectMapper.writeValueAsString(object);
//	}
//}