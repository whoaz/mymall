package org.helloz.mymall.order.dao;

import org.helloz.mymall.order.entity.OrderOperateHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:53:57
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistory> {
	
}
