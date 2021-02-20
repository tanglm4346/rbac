package com.tlm.security.rbac.service.impl;

import com.tlm.security.rbac.entity.User;
import com.tlm.security.rbac.form.UserForm;
import com.tlm.security.rbac.mapper.UserMapper;
import com.tlm.security.rbac.service.UserService;
import com.tlm.security.rbac.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result register(UserForm form) {
        User user = new User();
        user.setUsername(form.getUsername());
        user.setPassword(passwordEncoder.encode(form.getPassword()));
        user.setRealName(form.getRealName());
        user.setMobile(form.getMobile());
        user.setEnable(1);
        user.setCreateTime(new Date());
        if (userMapper.loadUserByUsername(user) == null) {
            userMapper.insertOne(user);
            return Result.success();
        }
        return Result.fail("用户已存在");
    }
}
