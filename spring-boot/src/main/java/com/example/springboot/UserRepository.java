package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
