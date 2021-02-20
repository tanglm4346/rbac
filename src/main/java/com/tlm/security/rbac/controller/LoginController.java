package com.tlm.security.rbac.controller;


import com.tlm.security.rbac.form.UserForm;
import com.tlm.security.rbac.service.UserService;
import com.tlm.security.rbac.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Field;

@RestController
@Slf4j
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public Result login() {
        return Result.fail("用户未登录");
    }


    @PostMapping("/register")
    public Result register(@RequestBody @Valid UserForm userForm, BindingResult bindingResult) {

        log.info("userForm=>{}", userForm);
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            String msg = fieldError.getDefaultMessage();
            return Result.fail(msg);
        }
        return userService.register(userForm);
    }

    /**
     * 获取验证码接口
     */
    @GetMapping("/code")
    public void code() {
    }


    @GetMapping("/test")
    @PreAuthorize("hasAuthority('admin')")
    public Result test() {
        return Result.success("测试权限接口");
    }

}
