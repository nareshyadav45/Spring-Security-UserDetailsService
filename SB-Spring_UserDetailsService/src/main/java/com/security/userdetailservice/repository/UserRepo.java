package com.security.userdetailservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.userdetailservice.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	public User findByUsername(String userName);
	
	
}
