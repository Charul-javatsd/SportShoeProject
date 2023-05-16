package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Bank;
import org.springframework.data.jpa.repository.Query;
public interface BankRepo extends JpaRepository<Bank, Integer>{
	@Query("Select b.balance from Bank b where b.Bid=?1")
	public int getPass(int id);
}
