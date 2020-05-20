package com.spring.angular.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ntt_dat_users")
@Data
@Getter
@Setter
public class Users {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "position")
    private String position;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "role_id")
    private long roleId;

    @Column(name = "start_date")
    @UpdateTimestamp
    private Date startDate;

    @Column(name = "end_date")
    @UpdateTimestamp
    private Date endDate;

    @Column(name = "country_id")
    private long countryId;

    @Column(name = "city_id")
    private String cityId;

    @Column(name = "district_id")
    private String districtId;

    @Column(name = "address")
    private String address;

    @Column(name = "zipcode_id")
    private long zipcodeId;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "modify_date")
    @UpdateTimestamp
    private Date modifyDate;

    @Column(name = "modify_user_id")
    private long modifyUserId;

    @Column(name = "enabled")
    private long enabled;
}
