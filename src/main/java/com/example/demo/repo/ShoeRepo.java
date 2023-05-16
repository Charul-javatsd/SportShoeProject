package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Shoes;
public interface ShoeRepo extends JpaRepository<Shoes, Integer> {

}
