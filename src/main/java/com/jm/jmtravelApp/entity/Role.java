package com.jm.jmtravelApp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Role
 *
 * @author Eric
 * @date 2017/12/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=JSOGGenerator.class)
@Entity
@Table(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "uuid", columnDefinition = "varchar(50) COMMENT '主键'")
    @GenericGenerator(name = "role-uuid", strategy = "uuid")
    @GeneratedValue(generator = "role-uuid")
    private String uuid;

    @Column(columnDefinition = "varchar(100) COMMENT '角色名称'")
    private String roleName;

    @Column(columnDefinition = "varchar(100) COMMENT '角色描述'")
    private String roleDescription;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_permission", joinColumns = {@JoinColumn(name = "role_uuid")}, inverseJoinColumns = {@JoinColumn(name = "permission_uuid")})
    private List<Permission> permissionList = new ArrayList<>();

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

}
