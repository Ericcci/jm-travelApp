package com.jm.jmtravelApp.dao;

import com.jm.jmtravelApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;

/**
 * UserDao
 *
 * @author Eric
 * @date 2017/12/21
 */

public interface UserDao extends JpaRepository<User, String> {

    User findByUserName(String name);
}
