package com.noarsark.mall.coupon.dao;

import com.noarsark.mall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-04-30 21:38:46
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
