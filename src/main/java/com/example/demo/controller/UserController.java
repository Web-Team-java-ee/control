package com.example.demo.controller;
import com.example.demo.mapper.TaskListMapper;
import com.example.demo.mapper.TaskMapper;
import com.example.demo.model.Task;
import com.example.demo.model.TaskList;
import com.example.demo.model.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TaskListMapper taskListMapper;


    @Autowired
    private TaskMapper taskMapper;

    //登陆
    @GetMapping("/login")
    public String Login(){
        return "login";
    }

    @RequestMapping("/addLogin")
    public String addLogin(HttpServletRequest request, Model model, Map<String,Object> map, HttpServletResponse response, HttpSession session1){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userMapper.Identify(username,password);

        if(user!=null)
        {
          ServletContext servletContext=request.getSession(true).getServletContext();
            System.out.println(user);
            //传给下个页面个username，可添加
            List<TaskList> taskList=taskListMapper.findTaskList(user.getId());
            System.out.println(taskList);
            TaskList firstTaskList=taskListMapper.findOneTaskList(user.getId(),1);
            List<Task> tasks= taskMapper.getTask(user.getId(),firstTaskList.getTask_index());
            servletContext.setAttribute("user",user);
            servletContext.setAttribute("taskList",taskList);
            servletContext.setAttribute("tasks",tasks);
            servletContext.setAttribute("firstTaskList",firstTaskList);
            Task task=taskMapper.getOneTask(1,user.getId());
            servletContext.setAttribute("currentTask",task);
            return "test";
        }
        else
        {
            map.put("msg","登录失败");
            return "login";
        }
    }

    //注册
    @GetMapping("/register")
    public String Register(){
        return "register";
    }

    @RequestMapping("/addUser")
    public String register(HttpServletRequest request)
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        User user = new User();
        user.setUser_name(username);
        user.setPassword(password);
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss:SSS");
        user.setCreate_time(df.format(date));
        user.setUpdate_time(df.format(date));
        userMapper.save(user);
        return "login";
    }






}