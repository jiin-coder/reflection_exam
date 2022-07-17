package com.ll.exam.service;

import com.ll.exam.annotation.CustomAutowired;
import com.ll.exam.ropository.UserRepository;

import java.util.Arrays;

public class UserService {
    @CustomAutowired
    private UserRepository userRepository;

    public void printAll() {
        Arrays.stream(userRepository.getAll()).forEach(e->System.out.print(e+" "));

    }
}
