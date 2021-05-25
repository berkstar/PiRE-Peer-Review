package com.pire.api.dto.account;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CreateStudentDto {

	@NotBlank
	private String email;
	
	@NotNull
	@Min(100)
	private Integer studentid;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String surname;
	
	@NotBlank
	private String password;
	
}
