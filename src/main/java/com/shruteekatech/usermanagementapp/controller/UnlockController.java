package com.shruteekatech.usermanagementapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shruteekatech.usermanagementapp.model.UnlockAccount;
import com.shruteekatech.usermanagementapp.props.AppConstants;
import com.shruteekatech.usermanagementapp.service.UserService;

@RestController
public class UnlockController {
	@Autowired
	private UserService userService;
	@PostMapping(value="/unlockAccount",consumes="application/json")
	public ResponseEntity<String> unlockAccount(@RequestBody UnlockAccount unlockAccount){
		boolean account = userService.unlockAccount(unlockAccount);
		if(account) {
			return new ResponseEntity<String>(AppConstants.UNLOCK_SUCCESS,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>(AppConstants.UNLOCK_FAIL,HttpStatus.OK);
		}
		
		
	}

}
