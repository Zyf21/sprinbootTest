package com.example.sprinboot.repos;

import com.example.sprinboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername (String username);
}
