package com.example.boardmysql.service;

import com.example.boardmysql.entity.User;
import com.example.boardmysql.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public void write(User jpa) {
        this.boardRepository.save(jpa);
    }
}
