package com.microservice.eurekaserver.fraudcustomer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification-service")
public interface NotificationServiceClient {

	@PostMapping("/api/v1/notification/send")
	public void sendNotification(@RequestBody NotificationRequestDto notificationRequestDto);
}
