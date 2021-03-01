package org.tyaa.demo.java.springboot.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private DemoService demoService;

    @GetMapping("")
    public List<User> getUsers() {
        return demoService.getUsers();
    }
}
