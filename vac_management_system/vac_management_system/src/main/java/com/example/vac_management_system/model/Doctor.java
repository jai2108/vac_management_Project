package com.example.vac_management_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data //generating getter and setter and creating constructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;
    private String doctorName;
    private String doctorEmailId;
    private Long doctorPhoneNumber;
}
