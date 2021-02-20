package com.tlm.security.rbac.mapper;

import com.tlm.security.rbac.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User loadUserByUsername(User user);

    void insertOne(User user);
}
