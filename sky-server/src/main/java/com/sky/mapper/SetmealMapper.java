package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SetmealMapper {

    /**
     * 查询分类下是否有启用状态的套餐
     * @param id
     * @return
     */
    @Select("select count(*) from setmeal where category_id = #{categoryId}")
    Integer checkCategoryInSetmeal(Long id);
}
