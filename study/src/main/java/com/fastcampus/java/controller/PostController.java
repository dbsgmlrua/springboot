package com.fastcampus.java.controller;

import com.fastcampus.java.model.SearchParam;
import com.fastcampus.java.model.entity.User;
import com.fastcampus.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>
    // ajax 검색
    // http post body -> data
    //  json, xml, multipart-form / text-plain

    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/postUser")
    public void createdUser(@RequestBody User user){
        User newUser = userRepository.save(user);
        System.out.println("newUser : "+newUser);
    }
}
