package com.ms.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.user.models.UserModel;
import com.ms.user.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public UserModel save(UserModel user) {
        return userRepository.save(user);
    }

}
