package com.example.airplane_service.service;

import com.example.airplane_service.domain.AirCompany;
import com.example.airplane_service.repository.AirCompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AirCompanyService extends AbstractService<AirCompany, Integer>{
    public AirCompanyRepository airCompanyRepository;

    @Override
    protected JpaRepository<AirCompany, Integer> getRepository() {
        return airCompanyRepository;
    }
}
