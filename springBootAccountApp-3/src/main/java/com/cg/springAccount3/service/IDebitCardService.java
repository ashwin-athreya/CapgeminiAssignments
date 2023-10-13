package com.cg.springAccount3.service;

import org.springframework.stereotype.Service;

import com.cg.springAccount3.entity.DebitCard;
import com.cg.springAccount3.entity.Insurance;

@Service
public interface IDebitCardService {
	
	public int saveDebitCard(DebitCard debitCard);
	public DebitCard getDebitCardByCardNumber(long cardNumber);
	public DebitCard updatePin(long cardNum, int newPin);

}
