package com.example.spring_demo.repo;

import com.example.spring_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User , Integer> {
}
