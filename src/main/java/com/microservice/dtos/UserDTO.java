package com.microservice.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder @NoArgsConstructor @Data 
public class UserDTO {
	

	private String userName;
	private String address;
	private String city;
	public UserDTO(String userName, String address, String city) {
		super();
		this.userName = userName;
		this.address = address;
		this.city = city;
	}

	
}
