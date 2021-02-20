package com.tlm.security.rbac.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserForm {
    @NotBlank(message = "账号不得为空")
    private String username;
    @NotBlank(message = "密码不得为空")
    @Size(min=6,message = "密码长度不得少于6位")
    private String password;

    @NotBlank(message = "真实名字不得为空")
    private String realName;

    @Size(max = 11,min=11,message = "手机号长度必须为11位")
    @NotBlank(message = "手机号码不得为空")
    private String mobile;
}
