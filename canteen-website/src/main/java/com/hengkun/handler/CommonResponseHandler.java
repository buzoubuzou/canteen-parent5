package com.hengkun.handler;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//响应拦截器
public class CommonResponseHandler extends HandlerInterceptorAdapter {
    /**
     * @Title: preHandle
     * @Description: 拦截响应，增加处理正确head
     * @param: request
     * @param: response
     * @param: handler
     * @return: true
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // 请求处理成功，设置响应消息头
//		response.setHeader(SysConstants.Header.CODE_NAME, SysConstants.Header.SUCCESS_CODE);
//		response.setHeader(SysConstants.Header.ERR_MSG_NAME, URLEncoder.encode("ok", "UTF-8"));
        return true;
    }

}
