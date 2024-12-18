package com.bmore.Challenge.service;

import com.bmore.Challenge.model.UserDto;

public interface IUserService {

    UserDto registerUser(UserDto userDto);

    String login(UserDto userDto);
}
