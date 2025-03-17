package com.example.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.Domains.user.User;

@Service
public class TokenService {
    @Value("${api.security.token.secret}")
    private String secret;


}
