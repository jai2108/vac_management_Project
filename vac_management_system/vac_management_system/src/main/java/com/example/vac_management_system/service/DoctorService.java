package com.example.vac_management_system.service;

import com.example.vac_management_system.model.Doctor;
import com.example.vac_management_system.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public String addDoctor(Doctor doctor){
          doctorRepository.save(doctor);
          return "Doctor added successfully";
    }
}
