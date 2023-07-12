package com.selenity.ngta.controller;

import com.selenity.ngta.entity.dataTransferObject.UserDTO;
import com.selenity.ngta.service.IUserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/find-one/{id}")
    public UserDTO findUserById(@PathVariable("id") Long userId){
        return iUserService.findOneUser(userId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Long userId){
        iUserService.deleteUser(userId);
    }

    @PutMapping("/update")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return iUserService.updateUser(userDTO);
    }

    @PostMapping("/create")
    public UserDTO createUser(@RequestBody UserDTO userDTO){
        return iUserService.createUser(userDTO);
    }

}
