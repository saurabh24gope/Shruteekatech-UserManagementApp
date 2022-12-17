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

}
