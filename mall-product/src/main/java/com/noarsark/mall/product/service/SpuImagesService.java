package com.noarsark.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.noarsark.common.utils.PageUtils;
import com.noarsark.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-04-23 15:40:59
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

