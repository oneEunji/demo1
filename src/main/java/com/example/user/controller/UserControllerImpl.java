package com.example.user.controller;
import java.util.List;
import java.util.Map;

import com.example.user.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements UserController {
    @Autowired
    UserDAO userDao;

    @Override
    @RequestMapping(value = "/select")
    public List<Map<String, ?>> getMessages() {
        return userDao.selectAll();
    }
}
