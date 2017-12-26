package com.jm.jmtravelApp.service.Impl;

import com.jm.jmtravelApp.dao.UserDao;
import com.jm.jmtravelApp.entity.User;
import com.jm.jmtravelApp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserServiceImpl
 *
 * @author Eric
 * @date 2017/12/22
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Cacheable(value = "userInfo", key = "'findByUuid-' + #uuid")
    @Override
    public User findByUuid(String uuid) {
        return userDao.findOne(uuid);
    }

    @CacheEvict(value = "userInfo", key = "'findByUuid-' + #user.getUuid()")
    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    //@CacheEvict(value="propertyInfo",allEntries=true)  清空全部
    //@CacheEvict(value = "propertyInfo", key = "'findUser' + #id")
}