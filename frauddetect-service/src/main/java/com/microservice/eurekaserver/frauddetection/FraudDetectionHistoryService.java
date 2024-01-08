package com.microservice.eurekaserver.frauddetection;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraudDetectionHistoryService {

	@Autowired
	private FraudDetectionHistoryRepository fraudDetectionHistoryRepository;

	
	public boolean checkFraudCustomer(Long customerId) {

		boolean fraudster = false;

		FraudDetectionHistory fraudDetectionHistory = FraudDetectionHistory
				.builder()
				.custId(customerId)
				.fraudster(fraudster)
				.createdAt(LocalDateTime.now())
				.build();
		
		fraudDetectionHistoryRepository.save(fraudDetectionHistory);

		return fraudster;

	}

}
