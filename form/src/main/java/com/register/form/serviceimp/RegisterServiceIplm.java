package com.register.form.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.form.dto.RegisterDto;
import com.register.form.entity.RegisterForm;
import com.register.form.repo.RegisterRepo;
import com.register.form.service.RegisterService;


@Service
public class RegisterServiceIplm implements RegisterService {

	@Autowired
	RegisterRepo registerRepo;
	@Override
	public RegisterDto saveResgister(RegisterDto dto) {
		
		RegisterForm registerForm=new RegisterForm();
		registerForm.setName(dto.getName());
		registerForm.setEmail(dto.getEmail());
		registerForm.setPassword(dto.getPassword());
		registerRepo.save(registerForm);
		
		return dto;
	}

}
