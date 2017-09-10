package cc.anjun.store.webapi.controller;

import cc.anjun.store.domain.entity.User;
import cc.anjun.store.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper mapper;

    @RequestMapping("/login")
    public User login(@RequestParam("username")String username,@RequestParam("password") String  password) {
        User user = mapper.get(1);
        return user;
    }
}
