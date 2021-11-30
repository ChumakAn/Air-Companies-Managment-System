package com.example.airplane_service.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "air_company")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class AirCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "company_type", length = 45)
    private String companyType;
    @Column(name = "founded_at", length = 10)
    private String foundedAt;

    @OneToMany(mappedBy = "airCompanyId", fetch = FetchType.LAZY)
    private List<Airplane> airplanes;

    @OneToMany(mappedBy = "airCompanyId",fetch = FetchType.LAZY)
    private List<Flight> flights;

}
