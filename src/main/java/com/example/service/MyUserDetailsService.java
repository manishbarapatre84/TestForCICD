package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.entity.MyUserDetails;
import com.example.entity.Users;
import com.example.repository.UsersReporsitory;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UsersReporsitory usersRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<Users> user= usersRepository.findByUsername(userName);
		
		user.orElseThrow(() -> new UsernameNotFoundException("Not Found : " + userName));
		
		return user.map(MyUserDetails::new).get(); 
		 
		//return new MyUserDetails(userName);
	}
}
