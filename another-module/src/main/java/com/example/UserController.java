package com.example;

import com.example.entities.User;

public class UserController {

    User saveUser(UserCommand command){
        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
