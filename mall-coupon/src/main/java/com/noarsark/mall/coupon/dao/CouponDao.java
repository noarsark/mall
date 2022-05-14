package com.noarsark.mall.coupon.dao;

import com.noarsark.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-04-30 21:38:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
