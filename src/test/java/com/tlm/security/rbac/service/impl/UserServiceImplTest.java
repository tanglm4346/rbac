package com.tlm.security.rbac.service.impl;

import com.tlm.security.rbac.RbacApplication;
import com.tlm.security.rbac.form.UserForm;
import com.tlm.security.rbac.service.UserService;
import com.tlm.security.rbac.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {RbacApplication.class})
@RunWith(SpringRunner.class)
@Slf4j
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void register() {
        UserForm form = new UserForm();
        form.setUsername("1234567");
        form.setMobile("17621610067");
        form.setPassword("123456");
        form.setRealName("唐黎明");
        Result result = userService.register(form);
        log.info("result={}", result);
    }

}
