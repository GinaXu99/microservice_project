package com.microservice.eurekaserver.notificationservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationServiceRepository extends JpaRepository<NotificationRequest, Long> {

}
