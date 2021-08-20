package com.taskmanager.persistence;

import com.taskmanager.domain.User;

import java.util.List;

public interface UserRepository {

    void saveUser(User newUser);

    List<User> findUsers();
}
