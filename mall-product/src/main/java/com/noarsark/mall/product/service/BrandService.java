package com.noarsark.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.noarsark.common.utils.PageUtils;
import com.noarsark.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-04-23 15:41:00
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

