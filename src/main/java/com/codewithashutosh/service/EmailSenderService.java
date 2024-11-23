package com.codewithashutosh.service;


import com.codewithashutosh.entity.EmailBody;
import jakarta.mail.MessagingException;

public interface EmailSenderService {
	
	Boolean sendAppointmentBookingMail(String toEmail, EmailBody emailBody) throws MessagingException;
	

}
