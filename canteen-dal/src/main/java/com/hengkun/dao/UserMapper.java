package com.hengkun.dao;
import com.hengkun.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
        //查询用户
        User queryUser(@Param("userId")int userId);

}
