package com.cg.springAccount3.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springAccount3.dto.AccountRequestSubmitDTO;
import com.cg.springAccount3.entity.Account;
import com.cg.springAccount3.entity.Verification;
import com.cg.springAccount3.exceptions.InvalidBalanceException;
import com.cg.springAccount3.service.IAccountService;
import com.cg.springAccount3.util.AccountDTOConvertor;
import com.cg.springAccount3.util.AccountTransactionResponseDTOConverter;

 
@RestController
@RequestMapping("/myaccountApp")
@Validated
public class AccountController {
	
	@Autowired
	IAccountService accService;
	
	@Autowired
	AccountDTOConvertor accDTOConverter;
	
	
	@Autowired
	AccountTransactionResponseDTOConverter dtoConverter;
	
	
	public AccountController() {
		super();
		// TODO Auto-generated constructor stub
	}


/*	@PostMapping("/register/account") 
	public int saveAccount(@RequestBody Account a) throws NullPointerException,InvalidBalanceException
	{
		int notification = accService.saveAccount(a);
		return notification;
	}    */

 
	@GetMapping("/getId/{id}")
	public Account getAccountById(@PathVariable int id) 
	{
		return accService.getAccountById(id);
	}

 
	@GetMapping("/getall")
	public ResponseEntity<List<Account>> getAllAccount()
	{
		// System.out.println("inside controller mapping");
		List<Account> temp = accService.getAllAccount();
		System.out.println(temp);
		return new ResponseEntity<List<Account>>(temp, HttpStatus.OK);
		
	}
	
	@PutMapping("/account/verification")
	public ResponseEntity<String> addVerification
	         (@RequestBody Verification verification,@RequestParam int id)
	{
		
		String status = accService.addVerificationDetails(id, verification);
		return new ResponseEntity<String>(status,HttpStatus.ACCEPTED);
		
	}
	
	
	@PutMapping("/insurance") // localhost:2002/emp/insurance?empid=5&inscode=1
	public Account addInsurance
	         (@RequestParam int id,@RequestParam int inscode)
	{
		
		Account updatedAccount = accService.addInsuranceToAccount(id, inscode);
		return updatedAccount;
	}
	
	@PutMapping("/cardNum") // localhost:2002/emp/insurance?empid=5&inscode=1
	public Account addCardNumber
	         (@RequestParam int id,@RequestParam int cardNum)
	{
		
		Account updatedAccount = accService.addCardNumberToAccount(id, cardNum);
		return updatedAccount;
	}
	
	
	@PutMapping("/updateAccountBal")
	public ResponseEntity<Account> updateAccountBalance(@RequestParam int id,@RequestParam int balance)
	{
		Account updatedAccount = accService.updateAccount(id, balance);
		Account a = new Account();
		if(updatedAccount != null)
		{
			return new ResponseEntity<Account>(updatedAccount, HttpStatus.OK);
		}
		else
			return new ResponseEntity<Account>(a, HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/account/location")  /// www.localhost:9211/myhrapp/employees
	public ResponseEntity<List<Account>> getAccounts(@RequestParam String loc)
	{
		System.out.println("inside controller getEmployeesBy Location()");
		List<Account> temp =  accService.getAccountByLocation(loc);
		System.err.println(temp.size());
		System.out.println(temp);
		return new ResponseEntity<List<Account>>(temp, HttpStatus.OK);
	}
	
	
	@PostMapping("/register/accdto") 
	public int saveAccount(@RequestBody @Valid AccountRequestSubmitDTO dto) throws InvalidBalanceException
	{
		Account a = accDTOConverter.getAccountFromAccountDTO(dto);
		int newId =  accService.saveAccount(a);
		return newId;
	}
	
}	
