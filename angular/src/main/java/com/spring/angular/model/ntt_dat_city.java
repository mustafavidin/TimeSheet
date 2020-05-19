package com.spring.angular.model;

import javax.persistence.*;


@Entity
@Table(name = "ntt_dat_city")
public class ntt_dat_city {

    private int cityId;
    private String city_name;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }


    public String getCityName() {
        return city_name;
    }

    public void setCityName(String city_name) {
        this.city_name = city_name;
    }
}
