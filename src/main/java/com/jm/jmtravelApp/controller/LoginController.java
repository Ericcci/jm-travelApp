package com.jm.jmtravelApp.controller;

import com.jm.jmtravelApp.common.InfoData;
import com.jm.jmtravelApp.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * LoginController
 *
 * @author Eric
 * @date 2017/12/26
 */
@Slf4j
@Controller
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public InfoData login(User user, HttpServletRequest request) {
        Subject currentUser = SecurityUtils.getSubject();
//new SimpleHash("MD5",user.getPassword(),user.getUserName()
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
        try {
            currentUser.login(token);
            return InfoData.success("登陆成功");
        } catch (Exception e) {
            return InfoData.fail("登录失败");
        }
    }
}
