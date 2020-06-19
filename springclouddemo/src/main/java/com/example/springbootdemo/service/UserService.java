package com.example.springbootdemo.service;

import javax.servlet.http.HttpSession;

public interface UserService {

    void login(String username, String password);
    void registered(String username, String password, int type);
}
