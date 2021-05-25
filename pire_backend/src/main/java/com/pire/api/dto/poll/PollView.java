package com.pire.api.dto.poll;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class PollView {
	
	@NotNull
	Integer id;
	
	@NotBlank
	String name;
	
	List<PollQuestionView> questions;
}
