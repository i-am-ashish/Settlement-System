package com.pojo;

public class Share {

	String shareName;
	int shareID;	
	int shareQty;
		
	public Share() {
		shareName ="";
		shareQty =0;
	}
	
	public Share(String shareName, int shareID,int shareQty) {
		super();
		this.shareName = shareName;
		this.shareQty = shareQty;
		this.shareID= shareID;
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
	public int getShareID() {
		return shareID;
	}
	public void setShareID(int shareID) {
		this.shareID = shareID;
	}
	
}
