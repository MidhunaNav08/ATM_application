package com.capg.ApplicationATM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.ApplicationATM.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account,Integer> {
	public Account findByUsername(String username);
}
