package org.tyaa.demo.java.springboot.simple;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DemoService {
    public List<User> getUsers() {
        return Arrays.asList(
                new User(1, "u1"),
                new User(2, "u2"),
                new User(3, "u3")
        );
    }
}
