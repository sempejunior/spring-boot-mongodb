package com.carlossempe.springbootandmongodb.services;

import com.carlossempe.springbootandmongodb.domain.User;
import com.carlossempe.springbootandmongodb.repository.UserRepository;
import com.carlossempe.springbootandmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }



    public User findByID(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow (() -> new ObjectNotFoundException ("This user don't exist"));
    }
}
