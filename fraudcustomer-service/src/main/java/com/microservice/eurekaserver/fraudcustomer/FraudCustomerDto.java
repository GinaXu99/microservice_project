package com.microservice.eurekaserver.fraudcustomer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FraudCustomerDto {
	private String firstName;
	private String lastName;
	private String email;
}
