package com.tlm.security.rbac.entity;

import org.springframework.security.core.GrantedAuthority;

public class UserAuthority implements GrantedAuthority {


    @Override
    public String getAuthority() {
        return null;
    }
}
