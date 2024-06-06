package com.register.form.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "register")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RegisterForm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String name;
	private String email;
	private String password;
}
