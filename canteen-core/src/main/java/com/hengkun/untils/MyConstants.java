package com.hengkun.untils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class MyConstants {
    public static class SysConstants{
        public final static String FULL_POINT = ".";
    }


    /**
     * api header name
     */
    public static class Header {
        public static final String SUCCESS_CODE = "0";
        public static final String ERR_CODE_DEFAULT = "500";
        public static final String ERR_MSG_DEFAULT = "error";

        // 用户名
        public static final String USERNAME = "username";
        // 用户认证token key
        public static final String USER_TOKEN = "token";
        // 用户认证session
        public static final String USER_SESSION = "PHPSESSID";
        // 过期时间key
        public static final String EXPIRE = "expire";
        public static final String USER_ID = "userId";
        public static final String COMPANY_ID = "companyId";
        public static final String FIRST_REQUEST = "firstRequest";
    }


    /**
     * 接口返回值状态码
     */
    public static class ResponseCode {
        // 操作成功状态码
        public static final String SUCCESS = "0";
        // 操作失败状态码
        public static final String FAIL = "-1";

        // 操作失败状态码
        public static final String ORDER_IMPORT_FAIL = "100001";
    }

    /**
     * 接口返回值状态码
     */
    public static class ResponseValue {
        // 操作成功状态码
        public static final String SUCCESS = "成功";
        // 操作失败状态码
        public static final String FAIL = "-1";

        // 操作失败状态码
        public static final String ORDER_IMPORT_FAIL = "100001";
    }

    @Component
    public static class RedisConstant {

        public static String TOKEN_PREFIX = "token_%s";

        public static String SESSION_KEY_PREFIX = "dream::wx_api::session_key::";

        public static String VERIFICATION_CODE_KEY_PREFIX = "dream::wx_api::verification_code::";

        public static String DREAM_CHNL_PREFIX = "dream.chnl.";

        public static String DREAM_TMPL_PREFIX = "dream.tmpl.";

        @Value("${user_redis_token.expire_time:7200}")
        public static Integer EXPIRE; //2小时
    }

    /**
     * cookie常量
     *
     */
    @Component
    public static class CookieConstant {

        public static String TOKEN = "token";

        @Value("${user_cookie_token.expire_time:7200}")
        public static Integer EXPIRE; //2小时

    }
}
