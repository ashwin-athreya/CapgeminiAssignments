package com.cg.springAccount3.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springAccount3.entity.DebitCard;
import com.cg.springAccount3.entity.Insurance;
import com.cg.springAccount3.repository.IDebitCardRepository;


@Service
public class IDebitCardServiceImpl implements IDebitCardService{
	
	@Autowired
	IDebitCardRepository debitCardRepository;
	
	

	
	@Override
	public int saveDebitCard(DebitCard debitCard) {
		int cardNum = 0;
		if(debitCard != null)
		{
			 DebitCard savedDebitCard = debitCardRepository.save(debitCard);
			 cardNum = (int) savedDebitCard.getCardNumber(); 
		}
		return cardNum;
	}


	@Override
	public DebitCard getDebitCardByCardNumber(long cardNumber) {
		
		return debitCardRepository.findById((long) cardNumber).get();
	}

    @Transactional
	@Override
	public DebitCard updatePin(long cardNum, int newPin) {
		DebitCard updatedPin=debitCardRepository.findById((long) cardNum).get();
		if(updatedPin!=null) {
			updatedPin.setPin(newPin);
			return updatedPin;
		}
		return null;
	}

}
