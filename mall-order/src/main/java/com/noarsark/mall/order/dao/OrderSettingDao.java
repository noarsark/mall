package com.noarsark.mall.order.dao;

import com.noarsark.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-05-01 17:45:21
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
