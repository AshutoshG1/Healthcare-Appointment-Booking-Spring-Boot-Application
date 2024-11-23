package com.codewithashutosh.repository;


import com.codewithashutosh.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDao extends JpaRepository<Doctor, Integer> {

    public Doctor findByMobileNo(String mobileNo);
}
