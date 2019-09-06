package com.logic;

import java.util.HashMap;

public interface SettlementSystem {


	public HashMap<String,Integer> getParticipantIdMap();
	public HashMap<String,Integer> getSecurityIdMap();
	public void performNettingProcedure(HashMap<Integer,HashMap<Integer,Integer>> map);
	public void generateObligationReport();
	public void detectShortages();
	public boolean performSettlement();//update the account balance from the netted table 
	public void handleCorporateAction(String coporateAction);
	public void generateCostofSelletmentReceipt();

	
	
}
