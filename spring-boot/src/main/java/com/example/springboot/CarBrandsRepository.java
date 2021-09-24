package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarBrandsRepository extends JpaRepository<CarBrands, Integer> {
	@Query(value="select brand from brand b where b.brand_id=:id",nativeQuery=true)
	String findByBrandId(int id);

}
