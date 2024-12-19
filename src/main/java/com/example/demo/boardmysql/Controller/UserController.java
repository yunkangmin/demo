package com.example.demo.boardmysql.Controller;

import com.example.demo.boardmysql.entity.User;
import com.example.demo.boardmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String main() {
        return "hello world";
    }

    @PostMapping("/register")
    public void registerUser(User user) {
        System.out.println("저장 => " + user.getName() + ", " + user.getEmail());
        this.userService.write(user);
    }
}
