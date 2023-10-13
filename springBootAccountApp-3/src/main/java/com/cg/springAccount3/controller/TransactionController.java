package com.cg.springAccount3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springAccount3.entity.Transaction;
import com.cg.springAccount3.service.ITransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	ITransactionService transactionService;
	
	@PostMapping("/add")
	public int addTransaction(@RequestBody Transaction trans) {
		
		int transCode=transactionService.saveTransaction(trans);
		return transCode;

	}

	@GetMapping("/getbyid")
	public ResponseEntity<Transaction>getTransactionById(@RequestParam int id){

		Transaction savedT= transactionService.getTransactionById(id);
		return new ResponseEntity<Transaction>(savedT,HttpStatus.OK);

	}

}
