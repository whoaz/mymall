package org.helloz.mymall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.order.dao.PaymentInfoDao;
import org.helloz.mymall.order.entity.PaymentInfo;
import org.helloz.mymall.order.service.PaymentInfoService;


@Service("paymentInfoService")
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoDao, PaymentInfo> implements PaymentInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PaymentInfo> page = this.page(
                new Query<PaymentInfo>().getPage(params),
                new QueryWrapper<PaymentInfo>()
        );

        return new PageUtils(page);
    }

}