package com.spring.angular.model;

import javax.persistence.*;

@Entity
@Table(name = "ntt_def_positions")
public class ntt_def_positions {

    private long positionId;
    private String typeName;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }


    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
