package com.sky.mapper;

import com.sky.entity.Setmeal;
import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品Id查询对应的套餐Id
     * @param dishIds
     * @return
     */
    //select setmeal id from setmeal dish where dish_id in (1,2,3,4)
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    /**
     * 批量保存套餐和菜品的关系
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据套餐od删除套餐和菜品的关联联系
     * @param setmealId
     */
    @Delete("delete  from setmeal_dish where  setmeal_id=#{setmealId}")
    void deleteBySetmealId(Long setmealId);


    /**
     * 根据套餐信息查询菜品信息
     * @param id
     * @return
     */
    List<SetmealDish> getBySetmealId(Long id);
}
