package com.capg.ApplicationATM.service;

import com.capg.ApplicationATM.exception.InsufficentException;

public interface TransferService {
	void transfer(int fromId, int toId, double amount) throws InsufficentException;
}
