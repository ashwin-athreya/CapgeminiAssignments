package com.cg.springAccount3.repository;

import com.cg.springAccount3.entity.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrasactionRepository extends JpaRepository<Transaction, Integer> {

}
