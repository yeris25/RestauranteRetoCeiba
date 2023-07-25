package com.example.Restaurantefinal.repository;

import com.example.Restaurantefinal.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface ClaimRepository  extends JpaRepository<Claim, Long> {
}
