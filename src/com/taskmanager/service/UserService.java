package com.taskmanager.service;

import com.taskmanager.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {


    public void createUser(User newUser){

        for(User i : showAllUser()){
            if(i.getUserName()==newUser.getUserName()){
                throw new RuntimeException("User nu este nu unic");
            }

        }


    }

    public List<User> showAllUser(){


        return new ArrayList<>();
    }
}
