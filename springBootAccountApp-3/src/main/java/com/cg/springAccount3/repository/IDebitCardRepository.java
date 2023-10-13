package com.cg.springAccount3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.springAccount3.entity.DebitCard;


@Repository
public interface IDebitCardRepository extends JpaRepository<DebitCard, Long>{
	
	

}
