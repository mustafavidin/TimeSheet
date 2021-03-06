package com.spring.angular.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ntt_dat_projects")
@Data
@Getter
@Setter
public class Projects {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "status")
    private String status;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "actual_man_day")
    private Integer actualManDay;

    @Column(name = "project_code")
    private Integer projectCode;

    @Column(name = "opp_id")
    private String oppId;

    @Column(name = "project_type")
    private String projectType;

    @Column(name = "pricing_model")
    private String pricingModel;

    @Column(name = "project_manager")
    private String projectManager;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "tcv")
    private Integer tcv;

    @Column(name = "margin")
    private Integer margin;

    @Column(name = "blended_rate")
    private String blendedRate;

}
