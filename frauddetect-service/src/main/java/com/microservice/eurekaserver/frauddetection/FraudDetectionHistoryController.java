package com.microservice.eurekaserver.frauddetection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/fraud")
@Slf4j
public class FraudDetectionHistoryController {
	
	@Autowired
	private FraudDetectionHistoryService fraudService;
	
	@GetMapping("{customerId}")
	public FraudDetectionHistoryResult checkFraudCustomer(@PathVariable Long customerId) {
	
		return new FraudDetectionHistoryResult(fraudService.checkFraudCustomer(customerId));
		
	}
}
