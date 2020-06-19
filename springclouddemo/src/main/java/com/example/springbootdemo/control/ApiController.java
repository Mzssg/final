package com.example.springbootdemo.control;

import com.example.springbootdemo.model.*;
import com.example.springbootdemo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.Timestamp;

@Controller
public class ApiController {

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String index(@RequestParam String username, @RequestParam String password) {
        return "index";
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public String student() {

        return "student";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam String username, @RequestParam String password, @RequestParam int type) {
        if(type==1){
            return "addhomework";
        }else{
            return "student";
        }
    }

    @RequestMapping(value = "/checkhomework",method = RequestMethod.GET)
    public String checkhomework() {

        return "checkhomework";
    }

    @RequestMapping(value = "/addstudent",method = RequestMethod.POST)
    public String addstudent() {

        return "addstudent";
    }

    @RequestMapping(value = "/addhomework",method = RequestMethod.POST)
    public String addhomework() {

        return "addhomework";
    }



}
