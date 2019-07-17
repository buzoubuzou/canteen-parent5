package com.hengkun.service;


import com.hengkun.model.entity.Room;

import java.util.List;

/**
 *包间订单管理Service层
 * @author 王煜焜
 * @create 2019-07-15 14:19
 **/
public interface RoomService {
    Room queryRoomById(Integer id);

    Boolean insertRoomInfo(Room room);

    List<Room> queryAllRoom();

    Room queryRoom(Integer id);

    Integer insertRoom(Room room);

    Integer deleteRoom(Integer id);

    Boolean updateRoomInfo(Room room);

    Boolean deleteRoomInfo(Integer id);
}
