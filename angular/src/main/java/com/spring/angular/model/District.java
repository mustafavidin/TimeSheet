package com.spring.angular.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ntt_dat_district")
@Data
@Getter
@Setter
public class District {

    @Id
    @Column(name = "district_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int district_id;

    @Column(name = "city_id")
    private int city_id;

    @Column(name = "district_name")
    private String districtname;

}
