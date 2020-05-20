package com.spring.angular.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ntt_dat_clients")
@Data
@Getter
@Setter
public class Clients {

    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

    @Column(name = "client_active")
    private String clientActive;

    @Column(name = "sector")
    private String sector;

    @Column(name = "tax_number")
    private String taxNumber;

    @Column(name = "tax_office")
    private String taxOffice;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_dep")
    private String contactDep;

    @Column(name = "contact_title")
    private String contactTitle;

    @Column(name = "contact_mail")
    private String contactMail;

    @Column(name = "contact_phone")
    private String contactPhone;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "address")
    private String address;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "fax")
    private String fax;

    @Column(name = "web")
    private String web;

    @Column(name = "client_name")
    private String clientName;
}
