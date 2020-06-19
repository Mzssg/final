package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.*;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO {
    void login(String username, String password);
    void registered(String username, String password, int type);
}
