package com.tlm.security.rbac.service.impl;


import com.tlm.security.rbac.RbacApplication;
import com.tlm.security.rbac.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {RbacApplication.class})
@RunWith(SpringRunner.class)
@Slf4j
public class UserDetailsServiceImplTest {
    @Autowired
    private  UserDetailsServiceImpl userDetailsServiceImpl;

    @Test
    public void loadUserByUsername() throws UsernameNotFoundException {
       User user = (User) userDetailsServiceImpl.loadUserByUsername("123456");
       log.info("result={}",user);
    }


}
