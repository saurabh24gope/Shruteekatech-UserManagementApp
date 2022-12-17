package com.shruteekatech.usermanagementapp.service;

import java.util.List;

import com.shruteekatech.usermanagementapp.entities.City;
import com.shruteekatech.usermanagementapp.entities.Country;
import com.shruteekatech.usermanagementapp.entities.State;
import com.shruteekatech.usermanagementapp.model.User;

public interface UserService {
	
	public List<Country> getAllCountries();
	
	public List<State> getAllStates(int countryId);
	
	public List<City> getAllCities(int stateId);
	
	public boolean saveUser(User user);

}
