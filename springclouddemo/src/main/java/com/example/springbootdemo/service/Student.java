package com.example.springbootdemo.service;

import com.example.springbootdemo.model.*;
import com.example.springbootdemo.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class Student implements StudentService {

    private HomeworkDAO homeworkDAO;


    @Override
    public List<addhomeworkmodel> studenthomework(String student) {
        return homeworkDAO.studenthomework(student);
    }

    @Override
    public void applyhomework(String homeworkname, String answer, String student) {
        homeworkDAO.applyhomework(homeworkname,answer,student);
    }
}
