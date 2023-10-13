package com.cg.springAccount3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.springAccount3.entity.Account;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Integer> {
	
	public List<Account> getAccountByLocation(String location);

}