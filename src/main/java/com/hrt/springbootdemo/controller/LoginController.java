package com.hrt.springbootdemo.controller;

import com.hrt.springbootdemo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    @RequestMapping(value="/login",produces="text/plain;charset=UTF-8")
    public String login(Model model){
        return "login";
    }

    @RequestMapping(value="/logout")
    public String logout(Model model,HttpServletRequest request){
        return "login";
    }

    @RequestMapping(value="/index",produces="text/plain;charset=UTF-8")
    public String index(Model model, HttpServletRequest request){

        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Person single = new Person("aa",11);

        List<Person> people = new ArrayList<>();
        Person person1 = new Person("zhangsan",22);
        Person person2 = new Person("lisi",33);
        Person person3 = new Person("wangwu",44);
        people.add(person1);
        people.add(person2);
        people.add(person3);

        model.addAttribute("singlePerson",single);
        model.addAttribute("people", people);

        return "index";
    }
}
