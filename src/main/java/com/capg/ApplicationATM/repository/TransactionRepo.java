package com.capg.ApplicationATM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.ApplicationATM.entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction,Integer>{

}
