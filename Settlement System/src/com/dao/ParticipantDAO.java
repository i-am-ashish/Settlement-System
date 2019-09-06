package com.dao;

import java.util.List;

import com.pojo.Participant;
import com.pojo.Share;

public interface ParticipantDAO {

	////////////////////////////////////////////////////////////////////////////////////////////
	public List<Share> getAllBalance(int participantId); //existing balance of funds and shares
	public List<Share> getClientNetValues(int participantId); //netted value of funds and shares
	public void updateBalance(String ClientID,List<Share> listOfShares);//
	public boolean updateParticipant(Participant participant);
	public boolean addParticipant(Participant participant);
	public boolean addLoginInfo(String username, String password);
	public boolean updateLoginInfo(int participantId, String password);
	public Participant getParticipantById(int participantId);
	public Integer getLoginInfo(String username, String password); //login validation from db
	public String getParticipantNameById(int participantId);	//For mapping clientId to its Name for UI
	public List<String> getAllParticipantName();

	
}
