package com.hengkun.service;

import com.hengkun.model.entity.Dishes;

import java.util.List;


/**
 *
 *菜品管理Service层
 * @author 王煜焜
 * @create 2019-07-15 14:19
 **/
public interface DishesService {


    Dishes queryDishesById(Integer id);

    List<Dishes> queryDishes(Dishes dishes, int pageNo, int pageSize);

    Boolean insertDishesInfo(Dishes dishes);

    Boolean updateDishesInfo(Dishes dishes);

    Boolean deleteDishesInfo(Integer id);

    List<Dishes> queryAllDishes();

    String list();

    Dishes queryDishes(Integer id);

    Integer insertDishes(Dishes dishes);

    Integer deleteDishes(Integer id);
}
