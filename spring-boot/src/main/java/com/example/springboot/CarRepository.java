package com.example.springboot;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.User;

public interface CarRepository extends JpaRepository<Car,Integer> {

}
