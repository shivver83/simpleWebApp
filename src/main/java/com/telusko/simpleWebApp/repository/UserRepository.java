package com.telusko.simpleWebApp.repository;

import com.telusko.simpleWebApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
