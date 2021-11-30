package com.example.airplane_service.domain;

import com.example.airplane_service.enums.FlightStatus;
import lombok.*;

import javax.persistence.*;

@Table(name = "flight")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "flight_status")
    private FlightStatus flightStatus;
    @Column(name = "departure_country", length = 45)
    private String departureCountry;
    @Column(name = "destination_country", length = 45)
    private String destinationCountry;
    @Column(name = "distance")
    private Double distance;
    @Column(name = "estimated_flight_time", length = 8)
    private String estimateFlightTime;
    @Column(name = "ended_at")
    private String endedAt;
    @Column(name = "delay_started_at")
    private String delayStartedAt;
    @Column(name = "created_at")
    private String createdAt;
    @ManyToOne
    @JoinColumn(name = "air_company_id", referencedColumnName = "id", nullable = false)
    private AirCompany airCompanyId;
    @ManyToOne
    @JoinColumn(name = "airplane_id", referencedColumnName = "id", nullable = false)
    private Airplane airplaneId;


}
