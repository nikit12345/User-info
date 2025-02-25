package com.microservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  @NoArgsConstructor @Data @Builder
public class Users {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	private Integer id;
	private String userName;
	private String address;
	private String city;
	public Users(Integer id, String userName, String address, String city) {
		super();
		this.id = id;
		this.userName = userName;
		this.address = address;
		this.city = city;
	}
	
	

}
