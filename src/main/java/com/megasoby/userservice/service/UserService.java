package com.megasoby.userservice.service;

import com.megasoby.userservice.dto.UserDto;
import com.megasoby.userservice.jpa.UserEntity;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
