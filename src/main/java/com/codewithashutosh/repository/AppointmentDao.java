package com.codewithashutosh.repository;


import com.codewithashutosh.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDao extends JpaRepository<Appointment, Integer> {

}
