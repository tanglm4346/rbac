package com.tlm.security.rbac.mapper;


import com.tlm.security.rbac.RbacApplication;
import com.tlm.security.rbac.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest(classes = {RbacApplication.class})
@RunWith(SpringRunner.class)
@Slf4j
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }


    @Test
    public void loadUserbyUserName() {
        User user = new User();
        user.setUsername("434632");
        User tUser = userMapper.loadUserByUsername(user);
        log.info("test user={}", tUser);
    }


    @Test
    public void insertOne() {
        User user = new User();
        user.setUsername("123456");
        user.setPassword("123456");
        user.setRealName("唐黎明");
        user.setEnable(1);
        user.setMobile("17621610067");
        user.setCreateTime(new Date());
        userMapper.insertOne(user);
        log.info("test end");
    }
}
