package com.microservice.eurekaserver.notificationservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FraudDetectionHistoryResult {

	private boolean fraudster;

}
