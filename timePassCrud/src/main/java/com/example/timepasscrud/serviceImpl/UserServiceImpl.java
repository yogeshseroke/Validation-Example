package com.example.timepasscrud.serviceImpl;

import com.example.timepasscrud.entity.User;
import com.example.timepasscrud.repository.UserRepository;
import com.example.timepasscrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

 public   User createUser(User user){
        return userRepository.save(user);
    }
}
