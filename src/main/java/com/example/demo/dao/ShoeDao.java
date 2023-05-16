package com.example.demo.dao;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Shoes;
import com.example.demo.repo.ShoeRepo;

@Service
public class ShoeDao {
	@Autowired
	ShoeRepo repo;
	public Shoes insert(Shoes s)
	{ 
		return repo.save(s);
		
	}
	public List<Shoes> getall()
	{
		return repo.findAll();
	}
	public String delete(Shoes s)
	 {   repo.delete(s);
		
	 return "deleted";
	 }
	public String update(Shoes s)
	{   repo.save(s);
		
	 return "updated";
	}
}
