package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public boolean addUser(String name,String password){
        Boolean test =null;
        if (userDAO.selectByName(name)==null){
            test = true;
            User user= new User();
            user.setName(name);
            user.setPassword(password);
            userDAO.addUser(user);
        }else
            test=false;
        return test;
    }
    public User getUser(String name){
        return userDAO.selectByName(name);
    }
}
