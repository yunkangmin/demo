package com.example.boardmysql.Controller;

import com.example.boardmysql.entity.User;
import com.example.boardmysql.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/hello")
    public String main() {
        return "hello world";
    }

    @PostMapping("/register")
    public void registerBoard(@RequestBody User jpa) {
        System.out.println(jpa.getName() + ", " + jpa.getEmail());
        this.boardService.write(jpa);
    }
}
