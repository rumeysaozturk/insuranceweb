package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springboot.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value="select count(*) from users u where u.tc=:tc",nativeQuery=true)
	int findByTc(String tc);
	
	@Query(value="select * from users u where u.tc=:tc",nativeQuery=true)
	User findByTcUser(String tc);
	

	@Query(value="select * from users u where u.user_id=:id",nativeQuery=true)
	User findByIdUser(int id);
	//@Query(value="update users u set u.name:name")
//	void updateUser(int id);
}
