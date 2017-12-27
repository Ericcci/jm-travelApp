package com.jm.jmtravelApp.service.Impl;

import com.jm.jmtravelApp.dao.PermissionInitDao;
import com.jm.jmtravelApp.entity.PermissionInit;
import com.jm.jmtravelApp.service.PermissionInitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * PermissionInitServiceImpl
 *
 * @author Eric
 * @date 2017/12/27
 */
@Service
public class PermissionInitServiceImpl implements PermissionInitService {

    @Resource
    private PermissionInitDao permissionInitDao;

    @Override
    public List<PermissionInit> findAll() {
        return permissionInitDao.findAll();
    }
}
