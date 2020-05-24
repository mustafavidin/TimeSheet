package com.spring.angular.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ntt_def_project_status")
@Data
@Getter
@Setter
public class ProjectStatus {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type_name")
    private String typeName;
}
