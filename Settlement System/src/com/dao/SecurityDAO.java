package com.dao;

import java.util.HashMap;
import java.util.List;

import com.pojo.Security;
import com.pojo.Transaction;

public interface SecurityDAO {
	public List<String> getAllSecutityName();//for drop down in the ui
	public HashMap<String,Integer> getSecurityIdMap();	
	public HashMap<Integer,Integer> getCorporateAction();//it will return corporate_actoin and ratio
	public boolean addCorporateAction(Security security); //add a new transaction to the table
	public boolean updateCorporateAction(Security security); //update existing transaction
	public boolean deleteCorporateAction(int securityId);//only do the corporsate_action as 0 and ratio as null dont delete the full security record
	

}
