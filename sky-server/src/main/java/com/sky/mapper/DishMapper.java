package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DishMapper {

    /**
     * 查询分类下是否有启用状态的菜品
     * @param id
     * @return
     */
    @Select("select count(*) from dish where category_id = #{categoryId}")
    Integer checkCategoryInDish(Long id);
}
