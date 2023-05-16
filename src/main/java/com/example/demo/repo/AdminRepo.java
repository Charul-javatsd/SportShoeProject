package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, String> {
@Query("Select a.Apwd from Admin a where a.Aname=?1")
public String getPass(String username);
}
