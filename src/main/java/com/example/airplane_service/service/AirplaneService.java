package com.example.airplane_service.service;

import com.example.airplane_service.domain.Airplane;
import com.example.airplane_service.repository.AirPlaneRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AirplaneService extends AbstractService<Airplane,Integer>{
    public AirPlaneRepository airPlaneRepository;
    @Override
    protected JpaRepository<Airplane, Integer> getRepository() {
        return airPlaneRepository;
    }
}
