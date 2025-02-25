package com.microservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class UserDTO {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	private Integer id;
	private String userName;
	private String address;
	private String city;

}
