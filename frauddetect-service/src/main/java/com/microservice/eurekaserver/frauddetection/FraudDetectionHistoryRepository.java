package com.microservice.eurekaserver.frauddetection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudDetectionHistoryRepository extends JpaRepository<FraudDetectionHistory, Long>{
	
}


