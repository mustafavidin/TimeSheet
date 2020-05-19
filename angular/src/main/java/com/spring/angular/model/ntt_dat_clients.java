package com.spring.angular.model;

import javax.persistence.*;

@Entity
@Table(name = "ntt_dat_clients")
public class ntt_dat_clients {

    private long clientId;
    private String clientActive;
    private String sector;
    private String taxNumber;
    private String taxOffice;
    private String contactName;
    private String contactDep;
    private String contactTitle;
    private String contactMail;
    private String contactPhone;
    private String country;
    private String city;
    private String district;
    private String address;
    private String zipcode;
    private String email;
    private String phone;
    private String fax;
    private String web;
    private String clientName;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }


    public String getClientActive() {
        return clientActive;
    }

    public void setClientActive(String clientActive) {
        this.clientActive = clientActive;
    }


    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }


    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }


    public String getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(String taxOffice) {
        this.taxOffice = taxOffice;
    }


    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }


    public String getContactDep() {
        return contactDep;
    }

    public void setContactDep(String contactDep) {
        this.contactDep = contactDep;
    }


    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }


    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }


    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }


    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
