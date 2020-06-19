package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HomeworkDAO {

    List<addhomeworkmodel> studenthomework(String student);
    List<applymodel> teacherhomework(String teacher);
    void applyhomework(String homeworkname, String answer, String student);
    void addhomework(String homeworkname, String homework, String teachername);
    void addstudent(String studentname, String teachername);

}
