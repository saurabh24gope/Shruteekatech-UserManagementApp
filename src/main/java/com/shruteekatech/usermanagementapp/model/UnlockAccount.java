package com.shruteekatech.usermanagementapp.model;

public class UnlockAccount {

	private String email;
	
	private String tempPwd;
	
	private String newPwd;
	
	private String cnfmPwd;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTempPwd() {
		return tempPwd;
	}

	public void setTempPwd(String tempPwd) {
		this.tempPwd = tempPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public String getCnfmPwd() {
		return cnfmPwd;
	}

	public void setCnfmPwd(String cnfmPwd) {
		this.cnfmPwd = cnfmPwd;
	}
	
	
}
