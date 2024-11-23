package com.codewithashutosh.repository;

import com.codewithashutosh.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDao extends JpaRepository<Patient, Integer> {

    public Patient findByMobileNo(String mobileNo);
}
