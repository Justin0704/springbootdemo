package com.hrt.springbootdemo.controller;

import com.hrt.springbootdemo.model.User;
import com.hrt.springbootdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public String queryAllUsers(Model model, HttpServletRequest request){
        List<User> users = userService.queryAllUsers();
        model.addAttribute("users",users);
        return "user/userList";
    }

    @RequestMapping("/user/{id}")
    @ResponseBody
    public String queryUserById(@PathVariable Long id){
        System.out.println("-------------------->id = " + id);
        User user = userService.queryUserById(id);
        if(user != null){
            System.out.println(user.toString());
        }else{
            System.out.println("-------------------->jjjjjjjjjjjjjjjjjjjjjj");
        }
        return user.toString();
    }

    @RequestMapping("/user/regUser")
    public String addUser(Model model, User user){
        if(user != null){
            user.setRegisterTime(new Date());
            user.setIsDelete("N");
            user.setEditTime(new Date());

        }
        Long userId = userService.regUser(user);
        logger.info("------------->add user id = " + userId);
        model.addAttribute("userId",userId);
        logger.info("regUser = " + user.toString());
        return "redirect:/users";
    }

    @RequestMapping("/user/delUser")
    public String deleteUser(Model model,HttpServletRequest request){
        Long id = Long.valueOf(request.getParameter("id"));
        userService.deleteUser(id);
        return "redirect:/users";
    }
    
    @RequestMapping("/user/delUser")
    public String updateUser(Model model, User user){
        userService.updateUser(user);
        return "redirect:/users";
    }

}
