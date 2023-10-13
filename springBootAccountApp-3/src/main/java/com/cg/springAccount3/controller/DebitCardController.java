package com.cg.springAccount3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springAccount3.entity.DebitCard;
import com.cg.springAccount3.service.IDebitCardService;

@RestController
@RequestMapping("/debitcard")
public class DebitCardController {

	@Autowired
	IDebitCardService debitCardService;

	public DebitCardController() {
		System.out.println("Debit card controller constructor ");
	}

	@PostMapping("/submit")
	public int addDebitCard(@RequestBody DebitCard debitCard)
	{
		int  savedDebitCardNum = debitCardService.saveDebitCard(debitCard);
		return savedDebitCardNum;
	}
	
	@GetMapping("getbyid/{cardNum}")
	public DebitCard getDebitCardByCardNumber(@PathVariable long cardNum) {
		DebitCard cNum=debitCardService.getDebitCardByCardNumber(cardNum);
		return cNum;
	}

	@PutMapping("/updatepin")
	public DebitCard updatePin(@RequestParam long c,@RequestParam int p) {
		DebitCard update=debitCardService.updatePin(c, p);
		return update;
	}
	
}
