package com.hengkun.model.entity;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 菜品实体类
 * @author 王煜焜
 * @create 2019-07-15 14:14
 **/
@Data
public class Dishes  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;                //ID
    private int categoryId;        //菜品ID
    private String name;           //菜品名称
    private String description;    //菜品描述
    private String url;            //菜品图片URL
    private Double rawcost;        //菜品原料成本
    private Double sale;           //菜品售价
    private int supplierId;        //菜品供应商ID
    private int goodsId;           //商品ID
    private int productId;         //产品ID
    public Integer getId() {
        return id;
    }

}
