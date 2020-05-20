package com.spring.angular.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ntt_def_positions")
@Data
@Getter
@Setter
public class Positions {

    @Id
    @Column(name = "position_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long positionId;

    @Column(name = "type_name")
    private String typeName;
}
