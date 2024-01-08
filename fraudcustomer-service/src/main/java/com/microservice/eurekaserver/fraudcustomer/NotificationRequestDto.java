package com.microservice.eurekaserver.fraudcustomer;

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
	private String sent_to_email;
	private LocalDateTime sent_at;
	
}
