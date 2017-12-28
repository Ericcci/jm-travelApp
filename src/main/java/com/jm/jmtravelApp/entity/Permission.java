package com.jm.jmtravelApp.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Permission
 *
 * @author Eric
 * @date 2017/12/27
 */
@Data
@ToString
@Entity
@Table(name = "permission")
public class Permission {

    @Id
    @Column(name = "uuid", columnDefinition = "varchar(50) COMMENT '主键'")
    @GenericGenerator(name = "permission-uuid", strategy = "uuid")
    @GeneratedValue(generator = "permission-uuid")
    private String uuid;

    @Column(nullable = false,columnDefinition = "varchar(200) COMMENT '链接地址'")
    private String urlAddress;

    @Column(columnDefinition = "varchar(200) COMMENT '链接描述'")
    private String urlDescription;

    @Column(nullable = false,columnDefinition = "varchar(200) COMMENT '具备的权限'")
    private String permissionInit;

    @Column(nullable = false,columnDefinition = "int(10) COMMENT '排序'")
    private Integer sort;
}
