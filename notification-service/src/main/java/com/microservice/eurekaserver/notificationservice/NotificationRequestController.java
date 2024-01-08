package com.microservice.eurekaserver.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/notification")
public class NotificationRequestController {

	@Autowired
	private NotificationRequestService notificationRequestService;

	@PostMapping("/send")
	public void sendNotification(@RequestBody NotificationRequestDto notificationRequestDto) {

		notificationRequestService.send(notificationRequestDto);
	}

}
