package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
   @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","您好");
        return "hello";
    }

    @GetMapping("/helloList")
    public String getList(Model model){

       List<Student> studentList=new ArrayList<>();
       studentList.add(new Student("张三",1));
       studentList.add(new Student("张4",2));
       studentList.add(new Student("张5",3));
       studentList.add(new Student("张6",4));

       model.addAttribute("studentList",studentList);
       return "hello";


    }
}
