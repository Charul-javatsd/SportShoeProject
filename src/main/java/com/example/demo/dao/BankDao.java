package com.example.demo.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.BankRepo;
@Service
public class BankDao {
	@Autowired
	BankRepo repo;
	public int getPass(int id) {
		return repo.getPass(id);
}
}