package org.helloz.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.order.entity.Order;

import java.util.Map;

/**
 * 订单
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:53:57
 */
public interface OrderService extends IService<Order> {

    PageUtils queryPage(Map<String, Object> params);
}

