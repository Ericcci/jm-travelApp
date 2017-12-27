package com.jm.jmtravelApp;

import com.jm.jmtravelApp.entity.User;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * test
 *
 * @author Eric
 * @date 2017/12/26
 */
public class test {
    public static void main(String[] args) {
        User user = new User();
        String test = new SimpleHash("MD5","yang","eric123").toString();
        System.out.println(test);
    }

}
