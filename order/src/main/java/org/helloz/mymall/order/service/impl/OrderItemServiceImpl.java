package org.helloz.mymall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.order.dao.OrderItemDao;
import org.helloz.mymall.order.entity.OrderItem;
import org.helloz.mymall.order.service.OrderItemService;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItem> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItem> page = this.page(
                new Query<OrderItem>().getPage(params),
                new QueryWrapper<OrderItem>()
        );

        return new PageUtils(page);
    }

}