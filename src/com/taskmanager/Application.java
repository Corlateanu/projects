package com.taskmanager;

import com.taskmanager.domain.User;
import com.taskmanager.persistence.FileUserRepository;
import com.taskmanager.service.TaskService;
import com.taskmanager.service.UserService;

public class Application {

    public static void main(String[] args) {
        //TaskService taskService = new TaskService();
//        UserService userService = new UserService(new FileUserRepository());
//
//        userService.createUser(new User("Alex","Tofan" , "Tofax"));
//        userService.createUser(new User("victo","Tobefan" , "asf"));
//        userService.createUser(new User("Alssssex","Tofasfan" , "dgadsg"));

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
