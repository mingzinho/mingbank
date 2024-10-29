package br.com.mingbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mingbank.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	public List<Transaction> findByUser_Id(Long id);
}
