package org.helloz.mymall.order.dao;

import org.helloz.mymall.order.entity.OrderReturnReason;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:53:57
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReason> {
	
}
