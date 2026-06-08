package com.primetrade.task_management_api.controller;
import com.primetrade.task_management_api.entity.User;
import com.primetrade.task_management_api.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UserService userService;
    public AuthController(UserService userService){
        this.userService=userService;
    }
    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.registerUser(user);
    }
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }
    @PostMapping("/login")
    public String login(@RequestBody User user){
        return userService.login(user.getEmail(),user.getPassword());
    }
}
