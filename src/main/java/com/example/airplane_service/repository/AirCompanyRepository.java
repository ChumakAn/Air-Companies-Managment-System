package com.example.airplane_service.repository;

import com.example.airplane_service.domain.AirCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirCompanyRepository extends JpaRepository<AirCompany, Integer> {

}
