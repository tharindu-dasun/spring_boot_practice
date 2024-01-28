package com.example.spring_demo.repo;

import com.example.spring_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User , Integer> {

    @Query(value = "SELECT * FROM User WHERE id = ?1" , nativeQuery = true)
    User getUserByUserID(String userId);
}
