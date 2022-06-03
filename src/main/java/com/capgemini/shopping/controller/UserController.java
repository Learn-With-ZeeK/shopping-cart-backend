package com.capgemini.shopping.controller;

import com.capgemini.shopping.dto.ResponseDto;
import com.capgemini.shopping.dto.user.SignInDto;
import com.capgemini.shopping.dto.user.SignInReponseDto;
import com.capgemini.shopping.dto.user.SignupDto;
import com.capgemini.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {
	  @Autowired
	    UserService userService;

	    // two apis

	    // signup

	    @PostMapping("/signup")
	    public ResponseDto signup(@RequestBody SignupDto signupDto) {
	        return userService.signUp(signupDto);
	    }


	    // signin

	    @PostMapping("/signin")
	    public SignInReponseDto signIn(@RequestBody SignInDto signInDto) {
	        return userService.signIn(signInDto);
	    }

}
