package com.shruteekatech.usermanagementapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="city_master")
public class City {
	@Column(name="city_id")
	private int cityId;
	@Column(name="city_name")
	private int stateName;
	@Column(name="city_stateid")
	private int stateId;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getStateName() {
		return stateName;
	}
	public void setStateName(int stateName) {
		this.stateName = stateName;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", stateName=" + stateName + ", stateId=" + stateId + "]";
	}
	
	

}
