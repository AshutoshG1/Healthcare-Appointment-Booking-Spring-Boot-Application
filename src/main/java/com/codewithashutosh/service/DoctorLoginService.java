package com.codewithashutosh.service;


import com.codewithashutosh.entity.LoginDTO;
import com.codewithashutosh.entity.LoginUUIDKey;
import com.codewithashutosh.exception.LoginException;

public interface DoctorLoginService {
	
	LoginUUIDKey logIntoAccount(LoginDTO loginDTO) throws LoginException;
	
	String logoutFromAccount(String key) throws LoginException;
	
	Boolean checkUserLoginOrNot(String key) throws LoginException;

}
