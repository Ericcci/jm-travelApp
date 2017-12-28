package com.jm.jmtravelApp.service.Impl;

import com.jm.jmtravelApp.service.PermissionService;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ShiroServiceImpl
 *
 * @author Eric
 * @date 2017/12/28
 */
@Service
public class ShiroServiceImpl {
    @Resource
    ShiroFilterFactoryBean shiroFilterFactoryBean;

    @Resource
    PermissionService permissionService;
}
