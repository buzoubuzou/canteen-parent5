package com.hengkun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hengkun.model.entity.Room;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 王煜焜
 * @create 2019-07-15 14:25
 **/
public interface RoomMapper extends BaseMapper<Room> {

    //查条件查询包间信息
    Room queryRoomInfoById(Integer id0);
    //添加包间信息
    int insertRoomInfo(Room room);
    //修改包间信息
    int updateRoomInfo(Room room);
    //删除包间信息
    int deleteRoomInfo(Integer id);
    //查条包间所有信息
    List<Room> queryAllRoom();
}
