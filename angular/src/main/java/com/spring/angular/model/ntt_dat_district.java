package com.spring.angular.model;

import javax.persistence.*;

@Entity
@Table(name = "ntt_dat_district")
public class ntt_dat_district {

    private int district_id;
    private int city_id;
    private String districtname;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getDistrictId() {
        return district_id;
    }

    public void setDistrictId(int district_id) {
        this.district_id = district_id;
    }


    public int getCityId() {
        return city_id;
    }

    public void setCityId(int city_id) {
        this.city_id = city_id;
    }


    public String getDistrictName() {
        return districtname;
    }

    public void setDistrictName(String districtname) {
        this.districtname = districtname;
    }

}
