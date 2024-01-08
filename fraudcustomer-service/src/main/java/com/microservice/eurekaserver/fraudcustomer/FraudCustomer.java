package com.microservice.eurekaserver.fraudcustomer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class FraudCustomer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; //entity needs id to store in DB
	
	private String firstName;
	private String lastName;
	private String email;
}
