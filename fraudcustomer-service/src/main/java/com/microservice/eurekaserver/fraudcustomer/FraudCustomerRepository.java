package com.microservice.eurekaserver.fraudcustomer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCustomerRepository extends JpaRepository<FraudCustomer, Long> {

}
