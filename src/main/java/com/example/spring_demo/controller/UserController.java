package com.example.spring_demo.controller;

import com.example.spring_demo.dto.UserDTO;
import com.example.spring_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/getuser")
    public String getUser(){
        return "Get User";
    }

    @PostMapping("/saveuser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateuser")
    public String updateUser(){
        return "Update User";
    }

    @DeleteMapping("/deleteuser")
    public String deleteUser(){
        return "Delete User";
    }
}
