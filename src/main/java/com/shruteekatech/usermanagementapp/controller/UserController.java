package com.shruteekatech.usermanagementapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shruteekatech.usermanagementapp.entities.City;
import com.shruteekatech.usermanagementapp.entities.Country;
import com.shruteekatech.usermanagementapp.entities.State;
import com.shruteekatech.usermanagementapp.model.User;
import com.shruteekatech.usermanagementapp.props.AppConstants;
import com.shruteekatech.usermanagementapp.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	AppConstants appconstants = new AppConstants();
	
	@GetMapping(value ="/getAllCountry",produces ="application/json")
	public ResponseEntity<List<Country>> getAllCountry(){
		List<Country> allCountries = userService.getAllCountries();
		return new ResponseEntity<List<Country>>(allCountries,HttpStatus.OK);
		}
	@GetMapping(value = "/getAllState",produces = "application/json")
	public ResponseEntity<List<State>>getAllState(@PathVariable int countryId){
		List<State> allStates = userService.getAllStates(countryId);
		return new ResponseEntity<List<State>>(allStates,HttpStatus.OK);
		}
	@GetMapping(value = "/getAllCity",produces = "application/json")
	public ResponseEntity<List<City>> getAllCity(@PathVariable int stateId){
		List<City> allCities = userService.getAllCities(stateId);
		return new ResponseEntity<List<City>>(allCities,HttpStatus.OK);
		}
	@PostMapping(value="/saveUser",consumes="application/json")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		boolean user2 = userService.saveUser(user);
		if(user2)
		return new ResponseEntity<String>(appconstants.SAVE_SUCESS,HttpStatus.CREATED);
		else
			return new ResponseEntity<String>(appconstants.SAVE_FAIL,HttpStatus.CREATED);
		}

}
