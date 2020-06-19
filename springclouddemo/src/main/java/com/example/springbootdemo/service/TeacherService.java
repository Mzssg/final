package com.example.springbootdemo.service;

import com.example.springbootdemo.model.*;
import java.util.List;


public interface TeacherService {


    List<applymodel> teacherhomework(String teacher);

    void addhomework(String homeworkname, String homework, String teachername);

    void addstudent(String studentname, String teachername);
}
