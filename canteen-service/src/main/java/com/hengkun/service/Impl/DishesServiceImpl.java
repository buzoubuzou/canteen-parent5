package com.hengkun.service.Impl;

import com.hengkun.dao.DishesMapper;
import com.hengkun.model.entity.Dishes;
import com.hengkun.service.DishesService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * 菜品管理接口
 * @author 王煜焜
 * @create 2019-07-15 14:20
 **/

@Service
@ComponentScan(basePackages = "com.hengkun.dao.DishesMapper")
public class DishesServiceImpl implements DishesService {
    @Resource
    private DishesMapper dishesMapper;

    @Override
    public Dishes queryDishesById(Integer id) {
        Dishes dishes = dishesMapper.selectById(id);
        System.out.println(dishes);
        return dishesMapper.selectById(id);
    }

    @Override
    public Boolean insertDishesInfo(Dishes dishes) {
        int row = dishesMapper.insertDishesInfo(dishes);
        if (row > 1) {
            throw new RuntimeException("插入不止一条数据，不符合规定");
        }
        System.out.println(dishes.getId());
        return row == 1 ? true : false;

    }

    @Override
    public Boolean updateDishesInfo(Dishes dishes) {
        int row = dishesMapper.updateDishesInfo(dishes);
        if (row > 1) {
            throw new RuntimeException("只能修改一条数据");
        }

        return row == 1 ? true : false;

    }

    @Override
    public Boolean deleteDishesInfo(Integer id) {
        int row = dishesMapper.deleteDishesInfo(id);
        if (row > 1) {
            throw new RuntimeException("只能删除一条数据");
        }
        return row == 1 ? true : false;

    }


    @Override
    public List<Dishes> queryAllDishes() {
        return dishesMapper.queryAllDishes();
    }

    @Override
    public String list() {
        return "emp/list";
    }

    @Override
    public Dishes queryDishes(Integer id) {
        return dishesMapper.queryDishesByName(id);
    }

    @Override
    public Integer insertDishes(Dishes dishes) {
        return dishesMapper.insert(dishes);
    }

    @Override
    public Integer deleteDishes(Integer id) {
        return dishesMapper.deleteById(id);
    }

    @Override
    public List<Dishes> queryDishes(Dishes dishes, int pageNo, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("dishes", dishes);
        int page = (pageNo - 1) * pageSize;
        map.put("page", page);
        map.put("pageSize", pageSize);
        return dishesMapper.queryDishes(map);
    }

}
