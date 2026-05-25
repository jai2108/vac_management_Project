package com.example.vac_management_system.controller;

import com.example.vac_management_system.model.Doctor;
import com.example.vac_management_system.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor){
       return doctorService.addDoctor(doctor);

    }

    @GetMapping("/getDoctorList")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @GetMapping("/getDoctorById")
    public Doctor getDoctorById(@RequestParam int doctorId){
        return doctorService.getDoctorById(doctorId);
    }
}
