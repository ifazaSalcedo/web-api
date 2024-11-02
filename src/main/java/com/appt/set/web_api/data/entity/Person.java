package com.appt.set.web_api.data.entity;

import com.appt.set.web_api.varius.State;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    private String name;
    private String lastname;
    private String ruc;
    private int dv;
    private String rucFormer;
    @Enumerated(EnumType.STRING)
    private State state;
    

}
