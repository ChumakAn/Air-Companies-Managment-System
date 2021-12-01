package com.example.airplane_service.mapper;

import com.example.airplane_service.domain.Airplane;
import com.example.airplane_service.dto.AirplaneDto;
import org.springframework.stereotype.Component;

@Component
public class AirplaneMapper extends AbstractMapper<Airplane, AirplaneDto>{

    @Override
    public AirplaneDto mapObjectToDto(Airplane airplane) {
        if (airplane == null) {
            return null;
        }
        AirplaneDto.AirplaneDtoBuilder airplaneDto = AirplaneDto.builder();
        airplaneDto.id(airplane.getId());
        airplaneDto.name(airplane.getName());
        airplaneDto.numberOfFlights(airplane.getNumberOfFlight());
        airplaneDto.flightDistance(airplane.getFlightDistance());
        airplaneDto.type(airplane.getType());
        airplaneDto.createdAt(airplane.getCreatedAt());
        airplaneDto.airCompanyIdName(airplane.getAirCompanyId().getName());
        return airplaneDto.build();
    }
}
