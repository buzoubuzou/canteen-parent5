package com.hengkun.controller;/**
 * @author yunik
 * @create 2019-07-15 11:58
 **/



import com.alibaba.druid.sql.visitor.functions.Substring;
import com.hengkun.model.entity.Dishes;
import com.hengkun.service.DishesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@ComponentScan(basePackages = "com.hengkun.service.DishesService")
@Slf4j
public class DishesController {
    @Resource
    private DishesService dishesService;

    @RequestMapping(value = "/emps")
    public  String list() {
        return "emp/list";
    }
    /**
     * 查询所有菜品
     * @author 王煜焜
     * @create 2019-07-15 11:58
     **/
    @RequestMapping(value = "/dishes",method = RequestMethod.GET)
    public Map<String, Object> queryAllDishes(){
        List<Dishes> dishesList = dishesService.queryAllDishes();
        Map<String, Object> map = new HashMap<>();
        map.put("dishesList", dishesList);
        System.out.println(dishesList);
        return map;
    }
    /**
     * 根据菜品ID查找
     * @author 王煜焜
     * @create 2019-07-15 11:58
     **/
    @RequestMapping(value = "/getDishes/{id}",method = RequestMethod.GET)
    public Dishes queryDishesByName(@PathVariable(value = "id")Integer id){
        return dishesService.queryDishes(id);
    }

    /**
     * 根据菜品名查找
     * @author 王煜焜
     * @create 2019-07-15 11:58
     **/
    @RequestMapping(value = "/dishes/{id}",method = RequestMethod.GET)
    public Dishes queryDishes(@PathVariable("id") Integer id){
       return dishesService.queryDishesById(id);
    }
    /**
     * 录入菜品信息
     * @author 王煜焜
     * @create 2019-07-15 11:58
     **/
    @RequestMapping(value = "/addDishes",method = RequestMethod.POST)
    public Integer insertDishes(@RequestBody Dishes dishes){
        return dishesService.insertDishes(dishes);
    }
    /**
     * 根据菜品ID删除
     * @author 王煜焜
     * @create 2019-07-15 11:58
     **/
    @RequestMapping(value = "/delDishes/{id}",method = RequestMethod.POST)
    public Integer deleteDishes(@PathVariable(value = "id") Integer id){
        return dishesService.deleteDishes(id);
    }



}
