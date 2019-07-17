package com.hengkun.controller;

import com.hengkun.model.entity.User;
import com.hengkun.service.Impl.UserServiceImpl;
import com.hengkun.service.UserService;
import com.hengkun.untils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @Resource
    private RedisUtil redisUtil;
    @RequestMapping("/queryUser")
    public User queryUser(int userId){
        Integer expire=1000000;
        redisUtil.set("test","redisTest");
        System.out.println(redisUtil.get("test"));
        User user = userService.queryUser(userId);
        redisUtil.set("用户",user,expire);
        System.out.println("将用户存入缓存并设置过期时间");
        return user;

        // return userService.queryUser(userId);
    }
}
