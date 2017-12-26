package com.jm.jmtravelApp.controller;

import com.jm.jmtravelApp.entity.User;
import com.jm.jmtravelApp.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * UserController
 *
 * @author Eric
 * @date 2017/12/21
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Api("用户")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{uuid}")
    public User get(@PathVariable String uuid) {
        return userService.findByUuid(uuid);
    }

    @PostMapping
    public User add(@RequestBody User user){
        log.info(user.getUserName());
        return user;
    }

    @PutMapping("/{uuid}")
    public String update(@PathVariable String uuid,@RequestBody User updateUser){
        User user = userService.findByUuid(uuid);
        user.setUserName(updateUser.getUserName());
        user.setPassword(updateUser.getPassword());
        user.setAge(updateUser.getAge());
        user.setPhone(updateUser.getPhone());
        userService.save(user);
        return "success";
    }
    @GetMapping("/home")
    public String home() {
        return "你好，Spring Boot";
    }
}
