package com.example.transactional_flight_service.repository;

import com.example.transactional_flight_service.Model.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
