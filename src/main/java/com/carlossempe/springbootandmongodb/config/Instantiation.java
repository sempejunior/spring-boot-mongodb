package com.carlossempe.springbootandmongodb.config;


import com.carlossempe.springbootandmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository repository;


    @Override
    public void run (String... args) throws Exception {
//        User maria = new User (null, "Maria Brown", "maria@gmail.com");
//        User alex = new User (null, "Alex Green", "alex@gmail.com");
//        User bob = new User (null, "Bob Grey", "bob@gmail.com");
//
//        repository.saveAll (Arrays.asList (maria,alex,bob));
    }
}
