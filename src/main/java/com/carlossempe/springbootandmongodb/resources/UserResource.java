package com.carlossempe.springbootandmongodb.resources;


import com.carlossempe.springbootandmongodb.domain.User;
import com.carlossempe.springbootandmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity <List<User>> findAll(){

        return ResponseEntity.ok().body(userService.findAll());
    }

}
