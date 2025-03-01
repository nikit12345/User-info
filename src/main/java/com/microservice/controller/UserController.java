package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.dtos.UserDTO;
import com.microservice.service.UserService;

@RestController @RequestMapping("/user")
@CrossOrigin(origins = "*")

public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
		UserDTO us = userService.saveUsers(userDTO);
		return new ResponseEntity<UserDTO>(us, HttpStatus.OK);
	}
	
	 @GetMapping("/getAll")
	    public ResponseEntity<List<UserDTO>> getAllUsers() {
	        // logic to get all users
	        return ResponseEntity.ok(userService.getAllUser());
	    }
    
	@GetMapping("/byId/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id) {
	    return userService.fetchUserDetailsById(id);
	}

	
}
