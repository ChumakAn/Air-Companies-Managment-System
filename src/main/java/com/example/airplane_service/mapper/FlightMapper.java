package com.example.airplane_service.mapper;

import com.example.airplane_service.domain.Flight;
import com.example.airplane_service.dto.FlightDto;
import org.springframework.stereotype.Component;

@Component
public class FlightMapper extends AbstractMapper<Flight, FlightDto> {

    @Override
    public FlightDto mapObjectToDto(Flight flight) {
        if (flight == null) {
            return null;
        }
        FlightDto.FlightDtoBuilder flightDto = FlightDto.builder();
        flightDto.id(flight.getId());
        flightDto.flightStatus(flight.getFlightStatus());
        flightDto.departureCountry(flight.getDepartureCountry());
        flightDto.destinationCountry(flight.getDestinationCountry());
        flightDto.distance(flight.getDistance());
        flightDto.estimatedFlightTime(flight.getEstimateFlightTime());
        flightDto.endedAt(flight.getEndedAt());
        flightDto.delayStartedAt(flight.getDelayStartedAt());
        flightDto.createdAt(flight.getCreatedAt());
        flightDto.airCompanyIdName(flight.getAirCompanyId().getName());
        flightDto.airplaneIdName(flight.getAirplaneId().getName());

        return flightDto.build();
    }
}
