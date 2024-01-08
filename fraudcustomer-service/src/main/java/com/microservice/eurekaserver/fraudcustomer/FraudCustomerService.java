package com.microservice.eurekaserver.fraudcustomer;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FraudCustomerService {
	
	@Autowired
	private FraudCustomerRepository fraudCustomerRepository;
	
	@Autowired
	private FraudServiceClient fraudServiceClient;
	
	@Autowired
	private NotificationServiceClient notificationServiceClient;
	
	
	/*
	 * two steps when register customer
	 * 1. check fraud with customer
	 * 2. send notification once check is done
	 * 
	 * */
	public FraudCustomer registerFraudCustomer(FraudCustomerDto fraudCustomerDto) {
		
		FraudCustomer fraudCustomer = FraudCustomer.builder()
				.firstName(fraudCustomerDto.getFirstName())
				.lastName(fraudCustomerDto.getLastName())
				.email(fraudCustomerDto.getEmail())
				.build();
		
		fraudCustomerRepository.save(fraudCustomer);
		
		//make a call to fraud detection
		//restTemplate.getForObject("http://fraud-service/api/v1/fraud/{customerId}", FraudDetectionHistoryResult.class, customer.getId());
		FraudDetectionHistoryResult FraudDetectionHistoryResult = fraudServiceClient.checkFraudCustomer(fraudCustomer.getId());
		
		NotificationRequestDto notificationRequestDto = NotificationRequestDto.builder()
				.message("Welcome " + fraudCustomer.getFirstName() + " " + fraudCustomer.getLastName())
				.sent_from("Microserve Project")
				.sent_to_email(fraudCustomer.getEmail())
				.sent_at(LocalDateTime.now())
				.sent_to_customerId(fraudCustomer.getId())
				.build();
		
		notificationServiceClient.sendNotification(notificationRequestDto);
		
		return fraudCustomer;
	
	}
	
	
	
	
}
