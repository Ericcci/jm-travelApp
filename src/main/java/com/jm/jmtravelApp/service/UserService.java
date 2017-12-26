package com.jm.jmtravelApp.service;

import com.jm.jmtravelApp.entity.User;
import org.springframework.stereotype.Service;

/**
 * UserService
 *
 * @author Eric
 * @date 2017/12/22
 */
public interface UserService {
    User findByUuid(String uuid);
    User save(User user);
}
