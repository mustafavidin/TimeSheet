package com.spring.angular.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Entity
@Table(name = "ntt_dat_users")
public class ntt_dat_users {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String firstName;
    private String lastName;
    private String password;
    private Date birthDate;
    private String employeeId;
    private String position;
    private String jobTitle;
    private long roleId;
    private java.sql.Timestamp startDate;
    private java.sql.Timestamp endDate;
    private long countryId;
    private String cityId;
    private String districtId;
    private String address;
    private long zipcodeId;
    private String email;
    private String phone;
    private java.sql.Timestamp modifyDate;
    private long modifyUserId;
    private long enabled;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }


    public java.sql.Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(java.sql.Timestamp startDate) {
        this.startDate = startDate;
    }


    public java.sql.Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(java.sql.Timestamp endDate) {
        this.endDate = endDate;
    }


    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }


    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }


    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public long getZipcodeId() {
        return zipcodeId;
    }

    public void setZipcodeId(long zipcodeId) {
        this.zipcodeId = zipcodeId;
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


    public java.sql.Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(java.sql.Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }


    public long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }


    public long getEnabled() {
        return enabled;
    }

    public void setEnabled(long enabled) {
        this.enabled = enabled;
    }

}
