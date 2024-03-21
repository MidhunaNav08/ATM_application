package com.capg.ApplicationATM.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.capg.ApplicationATM.dto.AccountDTO;
import com.capg.ApplicationATM.entity.Account;

@Mapper
public interface AccountMapper {
	Account toAccount(AccountDTO accountdto);
	AccountDTO toAccountDTO(Account account);
	List<AccountDTO> toAccountDTOs(List<Account> accounts);
}
