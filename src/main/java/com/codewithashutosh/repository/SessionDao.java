package com.codewithashutosh.repository;


import com.codewithashutosh.entity.CurrentSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionDao extends JpaRepository<CurrentSession, Integer> {
	
	public CurrentSession findByUuid(String uuid);
	
}
