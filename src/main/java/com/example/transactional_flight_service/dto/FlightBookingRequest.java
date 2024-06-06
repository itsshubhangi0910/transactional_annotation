package com.example.transactional_flight_service.dto;

import com.example.transactional_flight_service.Model.PassengerInfo;
import com.example.transactional_flight_service.Model.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;

}
