package com.jm.jmtravelApp.controller;

import com.jm.jmtravelApp.common.InfoData;
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
    public InfoData save(@RequestBody User user) {
        userService.save(user);
        return InfoData.success(user, "保存成功");
    }

    @PutMapping
    public InfoData update(@RequestBody User updateUser) {
        userService.update(updateUser);
        return InfoData.success(updateUser, "更新成功");
    }

    @GetMapping("/home")
    public String home() {
        return "你好，Spring Boot";
    }
}
