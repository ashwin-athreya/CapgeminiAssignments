package com.cg.springAccount3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springAccount3.entity.Insurance;
import com.cg.springAccount3.service.IInsuranceService;

@RestController
@RequestMapping("/ins")
public class InsuranceRestController {
	
	@Autowired
	IInsuranceService insuranceService;
	
	public InsuranceRestController() {
		System.out.println("Insurance Rest Controller Constructor called");
	}
	
	@PostMapping("/submit")
	public int addInsuranceEndPoint(@RequestBody Insurance insurance)
	{
		int  savedInsuranceCode = insuranceService.saveInsurance(insurance);
		return savedInsuranceCode;
	}

	@GetMapping("")
	public Insurance getInsurance(@RequestParam int code)
	{
		return insuranceService.getInsuranceByInsuranceCode(code);
	}
}
