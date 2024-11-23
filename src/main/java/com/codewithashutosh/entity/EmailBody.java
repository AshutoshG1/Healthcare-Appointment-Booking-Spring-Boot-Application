package com.codewithashutosh.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmailBody {
	
	String emailSubject;
	String emailBody;
	

}
