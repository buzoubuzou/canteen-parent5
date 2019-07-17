package com.hengkun.service.Impl;/**
 * @author yunik
 * @create 2019-07-15 14:20
 **/
import com.hengkun.dao.RoomMapper;
import com.hengkun.model.entity.Room;
import com.hengkun.service.RoomService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * 包间管理接口
 * @author 王煜焜
 * @create 2019-07-15 14:20
 **/

@Service
@ComponentScan(basePackages = "com.hengkun.dao.RoomMapper")
public class RoomServiceImpl implements RoomService {
    @Resource
    private RoomMapper roomMapper;


    @Override
    public Room queryRoomById(Integer id) {
        Room room = roomMapper.selectById(id);
        System.out.println(room);
        return roomMapper.selectById(id);
    }
    @Override
    public Boolean insertRoomInfo(Room room) {
        int row=roomMapper.insertRoomInfo(room);
        if(row>1) {
            throw new RuntimeException("插入不止一条数据，不符合规定");
        }
        System.out.println(room.getId());
        return row==1?true:false;

    }

    @Override
    public List<Room> queryAllRoom() {
        return roomMapper.queryAllRoom();
    }

    @Override
    public Room queryRoom(Integer id) {
        return roomMapper.queryRoomInfoById(id);
    }

    @Override
    public Integer insertRoom(Room room) {
        return roomMapper.insert(room);
    }

    @Override
    public Integer deleteRoom(Integer id) {
        return roomMapper.deleteById(id);
    }

    @Override
    public Boolean updateRoomInfo(Room room) {
        int row =roomMapper.updateRoomInfo(room);
        if(row>1) {
            throw new RuntimeException("只能修改一条数据");
        }

        return row==1?true:false;

    }

    @Override
    public Boolean deleteRoomInfo(Integer id) {
        int row =roomMapper.deleteRoomInfo(id);
        if(row>1) {
            throw new RuntimeException("只能删除一条数据");
        }
        return row==1?true:false;

    }
}
