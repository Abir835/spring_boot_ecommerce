package com.example.spring_boot_ecommerce.service;

import com.example.spring_boot_ecommerce.dto.AuthenticateRequest;
import com.example.spring_boot_ecommerce.dto.AuthenticationResponse;
import com.example.spring_boot_ecommerce.dto.RegisterRequest;
import com.example.spring_boot_ecommerce.dto.UserResponse;
import com.example.spring_boot_ecommerce.model.User;
import com.example.spring_boot_ecommerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public static AuthenticationResponse register(RegisterRequest request) {
        // implement letter
        return null;
    }

    public static AuthenticationResponse authenticate(AuthenticateRequest request) {
        //implement letter
        return null;
    }

    public List<User> findAll() {
        // implement letter
        return null;
    }

    public UserResponse getOne(Integer id) {
        //implement letter
        return null;
    }

    public UserResponse update(Integer id) {
        // implement letter
        return null;
    }

    public Void delete(Integer id) {
        //implement letter
        return null;
    }
}
