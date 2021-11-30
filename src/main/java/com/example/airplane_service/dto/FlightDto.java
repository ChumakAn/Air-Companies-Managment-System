package com.example.airplane_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlightDto {
    private Integer id;
    private String flightStatus;
    private String departureCountry;
    private String destinationCountry;
    private Double distance;
    private String estimatedFlightTime;
    private String endedAt;
    private String delayStartedAt;
    private String createdAt;
    private String airCompanyIdName;
    private String airplaneIdName;
}
