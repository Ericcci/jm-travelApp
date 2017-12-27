package com.jm.jmtravelApp.dao;

import com.jm.jmtravelApp.entity.PermissionInit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * PermissionInitDao
 *
 * @author Eric
 * @date 2017/12/27
 */
public interface PermissionInitDao extends JpaRepository<PermissionInit, String> {

    @Override
    List<PermissionInit> findAll();
}
