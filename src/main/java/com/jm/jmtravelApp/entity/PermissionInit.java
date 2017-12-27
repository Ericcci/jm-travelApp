package com.jm.jmtravelApp.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PermissionInit
 *
 * @author Eric
 * @date 2017/12/27
 */
@Data
@ToString
@Entity
@Table(name = "permission_init")
public class PermissionInit {

    @Id
    private String uuid;
    private String url;
    private String permissionInit;
    private Integer sort;
}
