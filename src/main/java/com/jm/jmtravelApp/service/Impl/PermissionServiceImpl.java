package com.jm.jmtravelApp.service.Impl;

import com.jm.jmtravelApp.dao.PermissionDao;
import com.jm.jmtravelApp.entity.Permission;
import com.jm.jmtravelApp.service.PermissionService;
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
public class PermissionServiceImpl implements PermissionService {

    @Resource
    private PermissionDao permissionDao;

    @Override
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }
}
