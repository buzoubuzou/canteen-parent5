package com.hengkun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hengkun.model.entity.Dishes;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * @author 王煜焜
 * @create 2019-07-15 14:25
 **/
@Mapper
public interface DishesMapper extends BaseMapper<Dishes> {


    //删除菜品信息
    @Delete("")
    int deleteDishesInfo(Integer id);
    //修改菜品信息

    int updateDishesInfo(Dishes dishes);
    //添加菜品信息
    int insertDishesInfo(Dishes dishes);

    //查询所有菜品信息
    @Select("select * from dishes")
    List<Dishes> queryAllDishes();
    //菜品信息分页查询
    List<Dishes> queryDishes(HashMap map);
    //按条件查询菜品信息
    Dishes queryDishesByName(Integer id);
}
