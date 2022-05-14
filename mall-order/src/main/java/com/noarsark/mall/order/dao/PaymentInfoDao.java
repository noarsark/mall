package com.noarsark.mall.order.dao;

import com.noarsark.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-05-01 17:45:21
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
