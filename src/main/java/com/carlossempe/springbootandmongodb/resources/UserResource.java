package com.carlossempe.springbootandmongodb.resources;


import com.carlossempe.springbootandmongodb.domain.User;
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

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity <List<User>> findAll(){

        return ResponseEntity.ok().body(Arrays.asList(new User("1","Teste7","teste@teste.com")));
    }

}
