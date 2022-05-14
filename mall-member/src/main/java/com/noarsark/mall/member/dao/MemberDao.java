package com.noarsark.mall.member.dao;

import com.noarsark.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-05-01 10:24:58
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
