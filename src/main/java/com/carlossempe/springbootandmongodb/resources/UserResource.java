package com.carlossempe.springbootandmongodb.resources;


import com.carlossempe.springbootandmongodb.domain.User;
import com.carlossempe.springbootandmongodb.dto.UserDTO;
import com.carlossempe.springbootandmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> findAll () {

        List<User> listUsers = userService.findAll ();

        List<UserDTO> listDTO =  listUsers.stream ().map (x -> new UserDTO (x)).collect (Collectors.toList ());

        return ResponseEntity.ok ().body (listDTO);
    }

    @RequestMapping(value ="/{id}" ,method = RequestMethod.GET)
    public ResponseEntity<UserDTO> findByID (@PathVariable String id) {

        User user = userService.findByID (id);

        UserDTO userDTO =   new UserDTO (user);
        return ResponseEntity.ok ().body (userDTO);
    }

}
