package com.tlm.security.rbac.code.model;

import lombok.Data;

/**
 * 短信验证码
 */
@Data
public class SmsCode  {
    private String content;
    private int len;
    private long expiredTime;
}
