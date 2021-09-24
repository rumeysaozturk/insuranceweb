package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ColorRepository extends JpaRepository<CarColors,Integer>{
	@Query(value="select color from color c where c.color_id=:id",nativeQuery=true)
	String findByColorId(int id);

}
