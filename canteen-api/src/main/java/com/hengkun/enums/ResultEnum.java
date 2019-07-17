package com.hengkun.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    LOGOUT_SUCCESS("LOGOUT_SUCCESS", "登出成功"),

    WECHAT_OPEN_AUTH_ERROR("WECHAT_OPEN_AUTH_ERROR", "认证失败");

    private String code;

    private String message;

    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
