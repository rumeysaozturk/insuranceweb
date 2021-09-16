package com.example.springboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArabaSigortaRepository extends JpaRepository<ArabaSigorta, Integer> {
	@Query(value = "Select * from asigorta s where s.plaque=:plaque and s.tc=:tc", nativeQuery = true)
	ArabaSigorta findByTcPlaque(String tc, String plaque);
}
