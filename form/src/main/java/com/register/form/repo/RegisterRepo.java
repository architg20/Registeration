package com.register.form.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.register.form.entity.RegisterForm;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterForm,Long> {

	
	
}
