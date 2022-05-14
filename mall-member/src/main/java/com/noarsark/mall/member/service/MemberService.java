package com.noarsark.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.noarsark.common.utils.PageUtils;
import com.noarsark.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-05-01 10:24:58
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

