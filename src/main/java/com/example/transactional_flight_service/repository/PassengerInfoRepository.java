package com.example.transactional_flight_service.repository;

import com.example.transactional_flight_service.Model.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,String> {
}
