package com.taskmanager.service;

import com.taskmanager.domain.User;
import com.taskmanager.persistence.UserRepository;

import java.util.List;

public class UserService  {

    UserRepository userRepository ;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User newUser) {

        for (User i : showAllUser()) {
            if (i.getUserName().equals(newUser.getUserName())) {
                throw new RuntimeException("User nu este nu unic");
            }

        }
        userRepository.saveUser(newUser);

    }

    public List<User> showAllUser() {

        return userRepository.findUsers();
    }
}
