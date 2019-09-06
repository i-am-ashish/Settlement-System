package com.dao;

import java.util.HashMap;
import java.util.List;

import com.pojo.Transaction;

public interface TransactionDAO {

	public List<Transaction> getAllTransaction();
	public List<Transaction> getTransactionByClientID(String participantId);
	public boolean generateNettingTable(HashMap<Integer,HashMap<Integer,Integer>> hashMap);
}
