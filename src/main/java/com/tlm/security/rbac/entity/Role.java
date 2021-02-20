package com.tlm.security.rbac.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;


@Data
public class Role implements GrantedAuthority {
    private long id;
    private String roleCode;
    private String roleName;
    @Override
    public String getAuthority() {
        return roleCode;
    }
}
