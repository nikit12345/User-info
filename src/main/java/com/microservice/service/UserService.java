package com.microservice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservice.dtos.UserDTO;
import com.microservice.models.Users;
import com.microservice.repo.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public UserDTO saveUsers(UserDTO userDTO) {
	Users user=	userRepo.save(Users.builder().address(userDTO.getAddress())
			.userName(userDTO.getUserName())
			.city(userDTO.getCity())
			.address(userDTO.getAddress()).build());
	
	
		
		return UserDTO.builder().userName(user.getUserName())
				.city(user.getCity())
				.address(user.getAddress()).build();
				
	}
	
	public List<UserDTO> getAllUser(){
		List<Users> u=userRepo.findAll();
		
		return u.stream().map(us-> UserDTO.builder().userName(us.getUserName())
				.address(us.getAddress())
				.city(us.getCity()).build()).collect(Collectors.toList());
		
		
		
	}
	
    public ResponseEntity<UserDTO> fetchUserDetailsById(Integer userId) {
          Optional<Users> optional = userRepo.findById(userId);
          
          if(optional.isPresent()) {
        	  Users us = optional.get();
        	  
        	  UserDTO userDTO = UserDTO.builder().userName(us.getUserName())
        			  .city(us.getCity())
        			  .address(us.getAddress()).build();
        	  
        	  return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
          }return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
}
}