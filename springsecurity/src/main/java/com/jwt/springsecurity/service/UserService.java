package com.jwt.springsecurity.service;

import com.jwt.springsecurity.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();


    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Durgesh","durgesh@dev.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rahul","rahul@dev.com"));
        store.add(new User(UUID.randomUUID().toString(),"Raj","raj@dev.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rupayan","rupayan@dev.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
