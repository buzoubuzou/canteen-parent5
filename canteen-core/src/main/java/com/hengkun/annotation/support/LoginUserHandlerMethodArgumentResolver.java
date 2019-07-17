package com.hengkun.annotation.support;

import com.hengkun.annotation.LoginUser;
import com.hengkun.untils.MyConstants;
import com.hengkun.untils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import javax.annotation.Resource;
import javax.xml.ws.soap.Addressing;

@Component
@ComponentScan("com.hengkun.untils")
public class LoginUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Resource
    private  RedisUtil redisUtil;

    public static final String LOGIN_TOKEN_KEY = "X-Litemall-Token";

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().isAssignableFrom(Integer.class)&&parameter.hasParameterAnnotation(LoginUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container,
                                  NativeWebRequest request, WebDataBinderFactory factory) throws Exception {

        String token = request.getHeader(LOGIN_TOKEN_KEY);
        if(token == null || token.isEmpty()){
            return null;
        }

        return (Integer)redisUtil.get(String.format(MyConstants.RedisConstant.TOKEN_PREFIX, token));
    }
}
