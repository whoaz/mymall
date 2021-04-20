package org.helloz.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.order.entity.OrderReturnApply;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:53:57
 */
public interface OrderReturnApplyService extends IService<OrderReturnApply> {

    PageUtils queryPage(Map<String, Object> params);
}

