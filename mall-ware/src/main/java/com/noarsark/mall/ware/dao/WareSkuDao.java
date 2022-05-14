package com.noarsark.mall.ware.dao;

import com.noarsark.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-05-01 19:20:48
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
