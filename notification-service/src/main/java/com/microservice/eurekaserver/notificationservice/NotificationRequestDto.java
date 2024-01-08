package com.microservice.eurekaserver.notificationservice;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequestDto {
	private String sent_from;
	private Long sent_to_customerId;
	private String message;
	private LocalDateTime sent_at;
	
	private String sent_to_email;
}
