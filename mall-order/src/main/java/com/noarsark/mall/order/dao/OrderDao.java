package com.noarsark.mall.order.dao;

import com.noarsark.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-05-01 17:45:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
