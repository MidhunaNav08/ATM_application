package com.capg.ApplicationATM.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.capg.ApplicationATM.dto.TransactionDTO;
import com.capg.ApplicationATM.entity.Transaction;

@Mapper
public interface TransactionMapper {
	Transaction toTransaction(TransactionDTO transactiondto);
	TransactionDTO toTransactionDTO(Transaction transaction);
	List<TransactionDTO> toTransactionDTOs(List<Transaction> transactions);
}
