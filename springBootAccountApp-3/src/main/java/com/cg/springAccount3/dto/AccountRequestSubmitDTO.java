package com.cg.springAccount3.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountRequestSubmitDTO {
	
	private int pin;
	@Size(min = 2,max = 5,message = "Invalid Location Value")
	private String location;
	@Min(value = 1999,message = "Balance cannot be less than 2000")
	private int balance;
	@NotNull(message = "Cannot be null")
	private String type;
	private String pan;

}
