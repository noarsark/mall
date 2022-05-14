package com.noarsark.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.noarsark.common.utils.PageUtils;
import com.noarsark.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-05-01 17:45:21
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

