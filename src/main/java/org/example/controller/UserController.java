package org.example.controller;

import org.example.entity.UserEntity;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getList")
    public List<UserEntity> getList() {
        return userService.list();
    }

//    @RequestMapping("/selectUserEntity")
//    public List<UserEntity> selectUserEntity() {
//        return userService.selectUserEntity();
//    }

    @RequestMapping("/selectUserEntity")
    public Map<String, Integer> selectUserEntity() {
        return userService.selectUserEntity();
    }
}
