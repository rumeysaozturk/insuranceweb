package com.example.springboot;
import java.util.List;

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
	@Query(value="select color from cars c where c.plaque=:plaque",nativeQuery=true)
	String findByColor(String plaque);
	@Query(value="select accident from cars c where c.plaque=:plaque",nativeQuery=true)
	char findByAccident(String plaque);
	
	@Query(value="select plaque from cars ",nativeQuery=true)
	List<String> findPlaque();
}
