package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarModelRepository extends JpaRepository<CarModel, Integer> {
	@Query(value="select model from model m where m.model_id=:id",nativeQuery=true)
	String findByModelId(int id);

}
