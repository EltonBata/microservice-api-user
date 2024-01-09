package com.ms.user.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.user.models.UserModel;
import com.ms.user.requests.UserSaveRequest;
import com.ms.user.services.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<UserModel> save(@RequestBody @Valid UserSaveRequest request) {

        UserModel user = mapper.convertValue(request, UserModel.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }

}
