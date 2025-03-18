package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.Domains.user.User;

public interface UserRepository extends JpaRepository <User,String> {
    UserDetails findByLogin(String login);
}
