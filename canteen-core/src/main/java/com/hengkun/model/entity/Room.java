package com.hengkun.model.entity;/**
 * @author yunik
 * @create 2019-07-15 14:14
 **/

import lombok.Data;

import javax.persistence.Id;

/**
 * 包间实体类
 * @author 王煜焜
 * @create 2019-07-15 14:14
 **/
@Data
public class Room {
    @Id
    private int id;                       //ID
    private String roomId;                //包间号
    private String orderId;               //订单号
    private String reservationId;         //预约ID
    private int bookTime;                 //预定时间
}
