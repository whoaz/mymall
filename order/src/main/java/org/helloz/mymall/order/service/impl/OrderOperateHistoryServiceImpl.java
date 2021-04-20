package org.helloz.mymall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.order.dao.OrderOperateHistoryDao;
import org.helloz.mymall.order.entity.OrderOperateHistory;
import org.helloz.mymall.order.service.OrderOperateHistoryService;


@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryDao, OrderOperateHistory> implements OrderOperateHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderOperateHistory> page = this.page(
                new Query<OrderOperateHistory>().getPage(params),
                new QueryWrapper<OrderOperateHistory>()
        );

        return new PageUtils(page);
    }

}