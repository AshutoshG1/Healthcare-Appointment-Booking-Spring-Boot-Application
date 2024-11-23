package com.codewithashutosh.repository;


import com.codewithashutosh.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageDao extends JpaRepository<Message, Integer> {

}
