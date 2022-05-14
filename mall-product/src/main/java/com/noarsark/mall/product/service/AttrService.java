package com.noarsark.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.noarsark.common.utils.PageUtils;
import com.noarsark.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-04-23 15:41:00
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

