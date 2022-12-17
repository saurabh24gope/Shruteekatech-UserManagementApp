package com.shruteekatech.usermanagementapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="state_master")
public class State {
	@Id
	@Column(name="state_id")
	private int stateId;
	@Column(name="state_name")
	private String stateName;
	@Column(name="country_id")
	private int CountryId;
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getCountryId() {
		return CountryId;
	}
	public void setCountryId(int countryId) {
		CountryId = countryId;
	}
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", CountryId=" + CountryId + "]";
	}
	
	

}
