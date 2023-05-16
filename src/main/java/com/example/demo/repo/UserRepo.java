package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.User;
public interface UserRepo extends JpaRepository<User, String> {
	@Query("Select u.userpwd from User u where u.uname=?1")
	public String getUserPass(String usrname);
	
}
