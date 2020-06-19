package com.example.springbootdemo.service;

import com.example.springbootdemo.model.*;
import javax.servlet.http.HttpSession;
import java.util.List;


public interface StudentService {
    List<addhomeworkmodel> studenthomework(String student);

    void applyhomework(String homeworkname, String answer, String student);
}
