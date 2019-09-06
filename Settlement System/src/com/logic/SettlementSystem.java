package com.logic;

import java.util.HashMap;

public interface SettlementSystem {


	public HashMap<String,Integer> getClientID(String clientName);
	public HashMap<String,Integer> getSecurity(String securityName);
	public void performNettingProcedure(HashMap<Integer,HashMap<Integer,Integer>> map);
	public void generateObligationReport();
	public void detectShortages();
	public void handleCorporateAction(String coporateAction);
	public void generateCostofSelletmentReceipt();
	
	
}
