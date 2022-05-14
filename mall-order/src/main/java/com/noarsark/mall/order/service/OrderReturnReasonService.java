package com.noarsark.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.noarsark.common.utils.PageUtils;
import com.noarsark.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author noarsark
 * @email noarsark17@gmail.com
 * @date 2022-05-01 17:45:21
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

