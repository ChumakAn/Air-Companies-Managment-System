package com.example.airplane_service.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "airplane")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "factory_serial_number", length = 45)
    private String factorySerialNumber;
    @Column(name = "number_of_flights")
    private Integer numberOfFlight;
    @Column(name = "flight_distance")
    private Double flightDistance;
    @Column(name = "fuel_capacity")
    private Integer fuelCapacity;
    @Column(name = "type", length = 45)
    private String type;
    @Column(name = "created_at", length = 10)
    private String createdAt;
    @ManyToOne
    @JoinColumn(name = "air_company_id", referencedColumnName = "id", nullable = false)
    private AirCompany airCompanyId;

    @OneToMany(mappedBy = "airplaneId", fetch = FetchType.LAZY)
    private List<Flight> flights;

}
