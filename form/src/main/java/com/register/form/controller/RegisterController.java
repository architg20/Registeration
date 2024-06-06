package com.register.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.form.dto.RegisterDto;
import com.register.form.service.RegisterService;

@CrossOrigin("*")
@RequestMapping("/register")
@RestController
public class RegisterController {

	@Autowired
	private RegisterService service;
	
	
	
	@PostMapping("/saveform")
	public String saveRegister(@RequestBody RegisterDto dto) {
		
		
		try {
			service.saveResgister(dto);
			return "User registered Succesfully";
		    }
		
		catch (Exception e) {
         return e.getMessage();

		}
	}
}
