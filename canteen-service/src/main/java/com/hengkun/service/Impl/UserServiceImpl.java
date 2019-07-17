package com.hengkun.service.Impl;

import com.hengkun.dao.UserMapper;
import com.hengkun.model.entity.User;
import com.hengkun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryUser(int userId) {
        return userMapper.queryUser(userId);
    }
}
