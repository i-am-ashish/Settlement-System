package com.pojo;

import java.util.List;

public class Participant {
	
	private int participantId;
	private String participantName;
	String emailId;
	int contactNumber;
	private float funds;
	private float feeForSettlemet;
	private List<Share> listOfshares;
	
	
	public Participant(int participantID, String participantName, String emailID, int contactNumber, float funds,
			float feeForSettlemet, List<Share> listOfshares) {
		super();
		this.participantId = participantID;
		this.participantName = participantName;
		this.emailId = emailID;
		this.contactNumber = contactNumber;
		this.funds = funds;
		this.feeForSettlemet = feeForSettlemet;
		this.listOfshares = listOfshares;
	}


	public int getParticipantId() {
		return participantId;
	}


	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}


	public String getParticipantName() {
		return participantName;
	}


	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public int getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}


	public float getFunds() {
		return funds;
	}


	public void setFunds(float funds) {
		this.funds = funds;
	}


	public float getFeeForSettlemet() {
		return feeForSettlemet;
	}


	public void setFeeForSettlemet(float feeForSettlemet) {
		this.feeForSettlemet = feeForSettlemet;
	}


	public List<Share> getListOfshares() {
		return listOfshares;
	}


	public void setListOfshares(List<Share> listOfshares) {
		this.listOfshares = listOfshares;
	}

	
	
	
	

}
