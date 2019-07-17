package com.hengkun.controller;/**
 * @author yunik
 * @create 2019-07-15 14:28
 **/

import com.hengkun.model.entity.Room;
import com.hengkun.service.RoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 根据包间ID查找
 * @author 王煜焜
 * @create 2019-07-15 14:28
 **/
@RestController
@ComponentScan(basePackages = "com.hengkun.service.RoomService")
@Slf4j
public class RoomController {
    @Resource
    private RoomService roomService;
    /**
     * 查询所有包间
     * @author 王煜焜
     * @create 2019-07-15 11:58
     **/
    @RequestMapping(value = "/room",method = RequestMethod.GET)
    public Map<String, Object> queryAllDishes(){
        List<Room> roomList = roomService.queryAllRoom();
        Map<String, Object> map = new HashMap<>();
        map.put("roomList", roomList);
        System.out.println(roomList);
        return map;
    }
    /**
     * 根据包间ID查找
     * @author 王煜焜
     * @create 2019-07-15 11:58
     **/
    @RequestMapping(value = "/getRoom/{id}",method = RequestMethod.GET)
    public Room queryRoomByName(@PathVariable(value = "id")Integer id){
        return roomService.queryRoom(id);
    }

    /**
     * 根据包间ID查找
     * @author 王煜焜
     * @create 2019-07-15 11:58
     **/
    @RequestMapping(value = "/room/{id}",method = RequestMethod.GET)
    public Room queryRoom(@PathVariable("id") Integer id){
        Room room = roomService.queryRoomById(id);
        return roomService.queryRoomById(id);
    }
    /**
     * 根据添加包间信息
     * @author 王煜焜
     * @create 2019-07-15 11:58
     **/
    @RequestMapping(value = "/addRoom",method = RequestMethod.POST)
    public Integer insertRoom(@RequestBody Room room){
        return roomService.insertRoom(room);
    }
    /**
     * 根据包间ID删除
     * @author 王煜焜
     * @create 2019-07-15 11:58
     **/
    @RequestMapping(value = "/delRoom/{id}",method = RequestMethod.POST)
    public Integer deleteRoom(@PathVariable(value = "id") Integer id){
        return roomService.deleteRoom(id);
    }



}
