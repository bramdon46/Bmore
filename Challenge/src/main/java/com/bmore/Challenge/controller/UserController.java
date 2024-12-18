package com.bmore.Challenge.controller;

import com.bmore.Challenge.model.UserDto;
import com.bmore.Challenge.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.registerUser(userDto), HttpStatus.OK);
    }

    @PostMapping(value = "/login")
    public ResponseEntity<String> login(@RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.login(userDto), HttpStatus.OK);
    }
}
