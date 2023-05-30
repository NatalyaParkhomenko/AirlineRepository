package com.example.airlinerepository.repository;

import com.example.airlinerepository.entity.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AirlineRepository extends JpaRepository <Airline, Long> {
}
