package com.example.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Users;

public interface UsersReporsitory extends JpaRepository<Users, Serializable>{
	
	Optional<Users> findByUsername(String userName);

}
