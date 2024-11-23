package com.codewithashutosh.service;


import com.codewithashutosh.entity.Doctor;
import com.codewithashutosh.exception.DoctorException;

import java.util.List;

public interface AdminDoctorService {
	
	
	Doctor registerDoctor(Doctor doctor) throws DoctorException;

	Doctor revokePermissionOfDoctor(Doctor doctor) throws DoctorException; 
	
	Doctor grantPermissionOfDoctor(Doctor doctor) throws DoctorException;
 
	List<Doctor> getAllValidInValidDoctors(String key) throws DoctorException;

}
