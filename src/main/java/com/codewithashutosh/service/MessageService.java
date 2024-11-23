package com.codewithashutosh.service;


import com.codewithashutosh.entity.Doctor;
import com.codewithashutosh.entity.Message;
import com.codewithashutosh.entity.Patient;
import com.codewithashutosh.exception.DoctorException;
import com.codewithashutosh.exception.PatientException;

import java.util.List;

public interface MessageService {
	
	Message sendMessageFromPatientToDoctor(String key, Message message) throws PatientException, DoctorException;

	Message sendMessageFromDoctorToPatient(String key, Message message) throws PatientException, DoctorException;

	List<Message> getMessageOfPatientParticularDoctor(String key, Doctor doctor) throws DoctorException, PatientException;

	List<Message> getMessageOfDoctorParticularPatient(String key, Patient patient) throws DoctorException, PatientException;

}
