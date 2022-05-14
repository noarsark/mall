package com.noarsark.mall.member.dao;

import com.noarsark.mall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-05-01 10:24:58
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
