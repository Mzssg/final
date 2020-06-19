package com.example.springbootdemo.service;


import com.example.springbootdemo.model.*;
import com.example.springbootdemo.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;


@Service
public class User implements UserService {


    private UserDAO userDAO;


    @Override
    public void login(String username, String password) {
        userDAO.login(username,  password);
    }

    @Override
    public void registered(String username, String password, int type) {
        userDAO.registered(username,  password,  type);
    }
}
