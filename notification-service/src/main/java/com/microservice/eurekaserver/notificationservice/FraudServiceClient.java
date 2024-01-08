package com.microservice.eurekaserver.notificationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
 * Before load balancing:
 * 	//testing use - http://localhost:8082/api/v1/fraud/1
	//testing use - http://localhost:8081/api/v1/customer
 * 
 * After load balancing, still use original urls
 * 	- Eureka server will internally use the load balancer to find the instances by instance name!
	- testing use url: 
	  //testing use - http://localhost:8082/api/v1/fraud/1
	  //testing use - http://localhost:8081/api/v1/customer
*/

@FeignClient(name="frauddetect-service") 
//@FeignClient(url="http://localhost:8082", value="fraud-service")
public interface FraudServiceClient {
	
	@GetMapping("/api/v1/fraud/{customerId}")
	FraudDetectionHistoryResult checkFraudCustomer(@PathVariable Long customerId);

}
