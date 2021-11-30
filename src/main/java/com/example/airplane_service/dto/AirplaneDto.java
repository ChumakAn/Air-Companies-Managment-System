package com.example.airplane_service.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AirplaneDto {
    private Integer id;
    private String name;
    private String factorySerialNumber;
    private Integer numberOfFlights;
    private Double flightDistance;
    private String type;
    private String createdAt;
    private String airCompanyIdName;

}
