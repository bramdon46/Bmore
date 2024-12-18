package com.bmore.Challenge.service.impl;

import com.bmore.Challenge.entity.User;
import com.bmore.Challenge.model.UserDto;
import com.bmore.Challenge.repository.IUserRepository;
import com.bmore.Challenge.service.IUserService;
import com.bmore.Challenge.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserRepository userRepository;

    @Autowired
    JwtUtil jwtUtil;

    @Override
    public UserDto registerUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        return UserDto.mapToUserDto(userRepository.save(user));
    }

    @Override
    public String login(UserDto userDto) {
        return jwtUtil.generateToken(userDto.getUserName());
    }
}
