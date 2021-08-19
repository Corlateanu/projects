package com.taskmanager.domain;

public class Task {
    String taskTitle;
    String userName;

    public Task(String taskTitle, String userName) {
        this.taskTitle = taskTitle;
        this.userName = userName;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
