package com.noarsark.mall.product.dao;

import com.noarsark.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-04-23 15:40:59
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
