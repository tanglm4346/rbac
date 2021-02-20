package com.tlm.security.rbac.code.model;

import lombok.Data;

/**
 * 图片验证码
 */
@Data
public class ImageCode extends SmsCode {
    private int height;
    private int width;
}
