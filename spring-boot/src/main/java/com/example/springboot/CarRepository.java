package com.example.springboot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springboot.User;

public interface CarRepository extends JpaRepository<Car,Integer> {

	@Query(value="select count(*) from cars c where c.plaque=:plaque",nativeQuery=true)
	int findByPlaque(String plaque);
	@Query(value="select * from cars c where c.plaque=:plaque",nativeQuery=true)
	Car findByPlaqueCar(String plaque);
	@Query(value="select year from cars c where c.plaque=:plaque",nativeQuery=true)
	Long findByYear(String plaque);
	@Query(value="select brand from cars c where c.plaque=:plaque",nativeQuery=true)
	String findByBrand(String plaque);
	@Query(value="select model from cars c where c.plaque=:plaque",nativeQuery=true)
	String findByModel(String plaque);
}
