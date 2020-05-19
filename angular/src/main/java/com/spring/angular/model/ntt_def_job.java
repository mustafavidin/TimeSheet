package com.spring.angular.model;


import javax.persistence.*;

@Entity
@Table(name = "ntt_def_job")
public class ntt_def_job {
    private long jobId;
    private String code;
    private String value;
    private String description;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
