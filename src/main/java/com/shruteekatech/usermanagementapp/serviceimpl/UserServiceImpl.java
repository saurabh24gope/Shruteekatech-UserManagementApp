package com.shruteekatech.usermanagementapp.serviceimpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shruteekatech.usermanagementapp.entities.City;
import com.shruteekatech.usermanagementapp.entities.Country;
import com.shruteekatech.usermanagementapp.entities.State;
import com.shruteekatech.usermanagementapp.entities.UserAccountEntity;
import com.shruteekatech.usermanagementapp.model.User;
import com.shruteekatech.usermanagementapp.repositories.CityRepository;
import com.shruteekatech.usermanagementapp.repositories.CountryRepository;
import com.shruteekatech.usermanagementapp.repositories.StateRepository;
import com.shruteekatech.usermanagementapp.repositories.UserRepository;
import com.shruteekatech.usermanagementapp.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Country> getAllCountries() {
		  List<Country> findAll = countryRepository.findAll();
		  return findAll;
	}

	@Override
	public List<State> getAllStates(int countryId) {
		List<State> findByCountryId = stateRepository.findByCountryId(countryId);
		return findByCountryId;
	}

	@Override
	public List<City> getAllCities(int stateId) {
		List<City> findByStateId = cityRepository.findByStateId(stateId);
		return findByStateId;
	}

	@Override
	public boolean saveUser(User user) {
		user.setAccStatus("LOCKED");
		user.setPassword(generateRandomPassword());
		UserAccountEntity userAccountEntity = new UserAccountEntity();
		BeanUtils.copyProperties(user, userAccountEntity);
		UserAccountEntity entity = userRepository.save(userAccountEntity);
		if(entity!=null) {
			return true;
		}
		else
		 return false;
	}

	private String generateRandomPassword() {
		
		return null;
	}
	

}
