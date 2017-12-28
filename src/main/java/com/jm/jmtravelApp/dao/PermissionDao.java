package com.jm.jmtravelApp.dao;

import com.jm.jmtravelApp.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PermissionDao
 *
 * @author Eric
 * @date 2017/12/27
 */
public interface PermissionDao extends JpaRepository<Permission, String> {

    @Override
    List<Permission> findAll();
}
