package com.example.demo.dao;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repo.UserRepo;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;

@Service
public class UserDao {
	@Autowired
	UserRepo repo;
	public String getUserPass(String username) {
		return repo.getUserPass(username);
	}
	public User insert(User u)
	{ 
		return repo.save(u);
		
	}
}
