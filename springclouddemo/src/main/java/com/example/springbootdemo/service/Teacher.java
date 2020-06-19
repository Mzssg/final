package com.example.springbootdemo.service;

import com.example.springbootdemo.model.*;
import com.example.springbootdemo.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class Teacher implements TeacherService {

    private HomeworkDAO homeworkDAO;


    @Override
    public List<applymodel> teacherhomework(String teacher) {

        return homeworkDAO.teacherhomework(teacher);
    }

    @Override
    public void addhomework(String homeworkname, String homework, String teachername) {
        homeworkDAO.addhomework(homeworkname, homework, teachername);
    }

    @Override
    public void addstudent(String studentname, String teachername) {
        homeworkDAO.addstudent(studentname,teachername);
    }
}
