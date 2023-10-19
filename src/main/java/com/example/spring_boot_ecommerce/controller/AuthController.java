package com.example.spring_boot_ecommerce.controller;

import com.example.spring_boot_ecommerce.dto.AuthenticateRequest;
import com.example.spring_boot_ecommerce.dto.AuthenticationResponse;
import com.example.spring_boot_ecommerce.dto.RegisterRequest;
import com.example.spring_boot_ecommerce.dto.UserResponse;
import com.example.spring_boot_ecommerce.model.User;
import com.example.spring_boot_ecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class AuthController {
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        log.info("Sign Up User");
        return ResponseEntity.ok(UserService.register(request));
    }
    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticateRequest request){
        log.info("Long In User");
        return ResponseEntity.ok(UserService.authenticate(request));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        log.info("Getting List of User");
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable Integer id){
        log.info("Getting Details of User({})", id);
        return ResponseEntity.ok(userService.getOne(id));
    }

    @PutMapping("{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable Integer id){
        log.info("Updating an User({}) ", id);
        return ResponseEntity.ok(userService.update(id));
    }

    @DeleteMapping("{id}")
    public Void delete(@PathVariable Integer id){
        log.info("Deleting an User({}) ", id);
        return userService.delete(id);
    }


}
