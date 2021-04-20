package org.helloz.mymall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.order.dao.OrderReturnReasonDao;
import org.helloz.mymall.order.entity.OrderReturnReason;
import org.helloz.mymall.order.service.OrderReturnReasonService;


@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonDao, OrderReturnReason> implements OrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnReason> page = this.page(
                new Query<OrderReturnReason>().getPage(params),
                new QueryWrapper<OrderReturnReason>()
        );

        return new PageUtils(page);
    }

}