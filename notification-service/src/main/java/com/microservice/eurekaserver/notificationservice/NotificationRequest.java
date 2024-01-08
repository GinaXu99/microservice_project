package com.microservice.eurekaserver.notificationservice;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String sent_from;
	private Long sent_to_customerId;
	private String message;
	private LocalDateTime sent_at;
	
	private String sent_to_email;
}
