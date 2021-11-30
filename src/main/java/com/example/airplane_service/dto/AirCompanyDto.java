package com.example.airplane_service.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AirCompanyDto {
    private Integer id;
    private String name;
    private String companyType;
    private String foundedAt;
}