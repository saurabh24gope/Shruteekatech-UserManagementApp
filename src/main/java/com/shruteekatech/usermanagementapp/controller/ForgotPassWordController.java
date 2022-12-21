package com.shruteekatech.usermanagementapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shruteekatech.usermanagementapp.service.UserService;

@RestController
public class ForgotPassWordController {
@Autowired	
private UserService userService;


@GetMapping("/forgotPassword/{email}")
public String forgotPassword(@PathVariable String email) {
	String forgotPwd = userService.forgotPwd(email);
	return forgotPwd;
	
}

}
