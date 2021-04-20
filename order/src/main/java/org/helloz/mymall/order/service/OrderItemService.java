package org.helloz.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.order.entity.OrderItem;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:53:57
 */
public interface OrderItemService extends IService<OrderItem> {

    PageUtils queryPage(Map<String, Object> params);
}

