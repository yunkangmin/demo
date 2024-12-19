package com.example.demo.boardmysql.service;

import com.example.demo.boardmysql.entity.User;
import com.example.demo.boardmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void write(User user) {
        this.userRepository.save(user);
    }
}
