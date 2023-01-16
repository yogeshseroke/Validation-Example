package com.example.timepasscrud.controller;

import com.example.timepasscrud.Dto.UserDto;
import com.example.timepasscrud.entity.User;
import com.example.timepasscrud.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("users")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){

        //Convert Dto to User Entity...
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        User saveUser = userService.createUser(user);

        //Convert User Entity to UserDto class...
        UserDto userResponse = new UserDto();
        userResponse.setId(saveUser.getId());
        userResponse.setName(saveUser.getName());
        userResponse.setEmail(saveUser.getEmail());

       // return new ResponseEntity<UserDto>(error , HttpStatus.CREATED);
        return new ResponseEntity<UserDto>(userResponse, HttpStatus.CREATED);
    }
}
