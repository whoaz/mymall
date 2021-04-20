package org.helloz.mymall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.order.dao.OrderReturnApplyDao;
import org.helloz.mymall.order.entity.OrderReturnApply;
import org.helloz.mymall.order.service.OrderReturnApplyService;


@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyDao, OrderReturnApply> implements OrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnApply> page = this.page(
                new Query<OrderReturnApply>().getPage(params),
                new QueryWrapper<OrderReturnApply>()
        );

        return new PageUtils(page);
    }

}