package com.spring.angular.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

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
    private int actualManDay;

    @Column(name = "date_created")
    @UpdateTimestamp
    private Date dateCreated;

}
