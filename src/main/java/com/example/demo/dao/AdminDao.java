package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.AdminRepo;
@Service
public class AdminDao {
@Autowired
AdminRepo repo;
public String getPass(String uname) {
	return repo.getPass(uname);
}
}
