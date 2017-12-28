package com.jm.jmtravelApp.service;

import com.jm.jmtravelApp.entity.Permission;

import java.util.List;

/**
 * PermissionService
 *
 * @author Eric
 * @date 2017/12/27
 */
public interface PermissionService {
    List<Permission> findAll();
}
