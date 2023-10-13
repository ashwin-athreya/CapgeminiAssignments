package com.cg.springAccount3.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvalidBalanceException extends Exception {

	private String errorMsg;
	private String srcResName;


}
