package com.microservice.eurekaserver.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationRequestService {
	
	@Autowired
	private NotificationServiceRepository notificationServiceRepository;
	
	
	public void send(NotificationRequestDto notificationRequestDto) {
		NotificationRequest notificationRequest = NotificationRequest.builder()
				.message(notificationRequestDto.getMessage())
				.sent_at(notificationRequestDto.getSent_at())
				.sent_from(notificationRequestDto.getSent_from())
				.sent_to_customerId(notificationRequestDto.getSent_to_customerId())
				.sent_to_email(notificationRequestDto.getSent_to_email())
				.build();
		
		notificationServiceRepository.save(notificationRequest);
	
	}

}
