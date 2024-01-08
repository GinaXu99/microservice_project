package com.microservice.eurekaserver.fraudcustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/customer")
public class FraudCustomerController {

	@Autowired
	private FraudCustomerService fraudCustomerService;

	@PostMapping
	public FraudCustomer register(@RequestBody FraudCustomerDto FraudCustomerDto) {

		return fraudCustomerService.registerFraudCustomer(FraudCustomerDto);
	}

}
