package com.example.demo.controller;

import com.example.demo.model.TableList;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes({"user","listname"})
public class LoginController {
    @Autowired
    private UserService userService;


    @RequestMapping(path = {"/","/login"})
    public String start(Model model){
        TableList tableList=new TableList();
        model.addAttribute("listname",tableList.table_name);
        return "login";
    }
    @RequestMapping(path = {"/register"})
    public String register(){
        return "register";
    }
    @RequestMapping(path = {"/main"})
    public String main(){

        return "main";
    }


    @RequestMapping(path = {"/postlogin"})
    public String postlogin(@RequestParam("name") String name,
                        @RequestParam("password") String password,
                            HttpSession session){
        User user= userService.getUser(name);
        if(user!=null){
            if ((user.getPassword()).equals(password)){
                session.setAttribute("user",user);
                return "/main";
            }

        }
        return "login";
    }
    @RequestMapping(path = {"/postregister"})
    public String postregister(@RequestParam("name") String name,
                            @RequestParam("password") String password){
        if(userService.addUser(name,password)){
                return "/login";
        }
        return "/register";
    }

    @RequestMapping(path = {"/logout"})
    public String logout(HttpSession session){
        session.removeAttribute("user");
        System.out.println(session.getAttribute("user"));
        return "login";
    }








}
