package com.shruteekatech.usermanagementapp.serviceimpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shruteekatech.usermanagementapp.entities.City;
import com.shruteekatech.usermanagementapp.entities.Country;
import com.shruteekatech.usermanagementapp.entities.State;
import com.shruteekatech.usermanagementapp.entities.UserAccountEntity;
import com.shruteekatech.usermanagementapp.model.Login;
import com.shruteekatech.usermanagementapp.model.UnlockAccount;
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

	@Override
	public String loginCheck(Login login) {
		String email = login.getEmail();
		String password = login.getPassword();
		UserAccountEntity entity = userRepository.findByEmailAndPassword(email, password);
		if(entity!=null) {
			if(entity.getAccStatus().equals("LOCKED")) {
				return "Your Account is Locked";
			}
			else {
				return "Login Success";
			}
		}
		return "Invalid Credentials";
	}

	@Override
	public boolean unlockAccount(UnlockAccount unlockAccoount) {
		
		String tempPwd = unlockAccoount.getTempPwd();
		String email = unlockAccoount.getEmail();
		UserAccountEntity user = userRepository.findByEmailAndPassword(email,tempPwd);
	    if(user!=null) {
	    	user.setAccStatus("UNLOCKED");
	        user.setPassword(unlockAccoount.getNewPwd());
	        userRepository.save(user);
	        return true;
	    }
	    else {
		return false;
	}
	    }

	@Override
	public String forgotPwd(String email) {
		UserAccountEntity findByEmail = userRepository.findByEmail(email);
		if(findByEmail!=null) {
			return "password is send to your registered email id";
		}
		else {
			return "mail is not registered please register first";
		}
		
		
	}
	

}

