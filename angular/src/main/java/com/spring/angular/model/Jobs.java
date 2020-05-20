package com.spring.angular.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ntt_def_job")
@Data
@Getter
@Setter
public class Jobs {
    @Id
    @Column(name = "job_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobId;

    @Column(name = "code")
    private String code;

    @Column(name = "value")
    private String value;

    @Column(name = "description")
    private String description;
}
