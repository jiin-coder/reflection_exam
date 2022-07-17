package com.ll.exam.controller;

import com.ll.exam.annotation.CustomAutowired;
import com.ll.exam.service.UserService;

public class UserController {
    @CustomAutowired
    private UserService userServiceInjectedInField;

    public void print(){
        userServiceInjectedInField.printAll();
    }
}
