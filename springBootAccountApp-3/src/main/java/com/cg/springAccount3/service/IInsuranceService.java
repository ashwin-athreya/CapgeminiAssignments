package com.cg.springAccount3.service;

import org.springframework.stereotype.Service;

import com.cg.springAccount3.entity.Insurance;

@Service
public interface IInsuranceService {

	public int saveInsurance(Insurance insurance);
	public Insurance getInsuranceByInsuranceCode(int code);
}
