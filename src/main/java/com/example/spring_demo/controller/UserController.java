package com.example.spring_demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @GetMapping("/getuser")
    public String getUser(){
        return "Get User";
    }

    @PostMapping("/saveuser")
    public String saveUser(){
        return "Save User";
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
