package com.pojo;

public class Transaction {
	
	int TxnID;
	private int SSIN_ID;
	private String buyer;
	private String seller;
	private String shareName;
	private int shareQty; 
	private float shareRate;
	private double transactionAmount;
	
	public Transaction() {
		
	}


	public Transaction(int txnID, int sSIN_ID, String buyer, String seller, String shareName, int shareQty,
			float shareRate, double transactionAmount) {
		super();
		TxnID = txnID;
		SSIN_ID = sSIN_ID;
		this.buyer = buyer;
		this.seller = seller;
		this.shareName = shareName;
		this.shareQty = shareQty;
		this.shareRate = shareRate;
		this.transactionAmount = transactionAmount;
	}


	public int getTxnID() {
		return TxnID;
	}


	public void setTxnID(int txnID) {
		TxnID = txnID;
	}


	public int getSSIN_ID() {
		return SSIN_ID;
	}


	public void setSSIN_ID(int sSIN_ID) {
		SSIN_ID = sSIN_ID;
	}


	public String getBuyer() {
		return buyer;
	}


	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}


	public String getSeller() {
		return seller;
	}


	public void setSeller(String seller) {
		this.seller = seller;
	}


	public String getShareName() {
		return shareName;
	}


	public void setShareName(String shareName) {
		this.shareName = shareName;
	}


	public int getShareQty() {
		return shareQty;
	}


	public void setShareQty(int shareQty) {
		this.shareQty = shareQty;
	}


	public float getShareRate() {
		return shareRate;
	}


	public void setShareRate(float shareRate) {
		this.shareRate = shareRate;
	}


	public double getTransactionAmount() {
		return transactionAmount;
	}


	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	
	
	

}
