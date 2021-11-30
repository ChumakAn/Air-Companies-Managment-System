package com.example.airplane_service.repository;

import com.example.airplane_service.domain.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirPlaneRepository extends JpaRepository<Airplane, Integer> {
}
