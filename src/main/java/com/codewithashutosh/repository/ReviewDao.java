package com.codewithashutosh.repository;


import com.codewithashutosh.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDao extends JpaRepository<Review, Integer> {

}
