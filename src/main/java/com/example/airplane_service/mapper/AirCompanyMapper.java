package com.example.airplane_service.mapper;

import com.example.airplane_service.domain.AirCompany;
import com.example.airplane_service.dto.AirCompanyDto;
import org.springframework.stereotype.Component;

@Component
public class AirCompanyMapper extends AbstractMapper<AirCompany, AirCompanyDto>{
    @Override
    public AirCompanyDto mapObjectToDto(AirCompany airCompany) {
        if(airCompany == null) {
            return null;
        }
        AirCompanyDto.AirCompanyDtoBuilder airCompanyDto = AirCompanyDto.builder();
        airCompanyDto.id(airCompany.getId());
        airCompanyDto.name(airCompany.getName());
        airCompanyDto.companyType(airCompany.getCompanyType());
        airCompanyDto.foundedAt(airCompany.getFoundedAt());

        return airCompanyDto.build();
    }
}
