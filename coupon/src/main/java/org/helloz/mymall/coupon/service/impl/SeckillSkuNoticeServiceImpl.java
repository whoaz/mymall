package org.helloz.mymall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;
import org.helloz.mymall.coupon.dao.SeckillSkuNoticeDao;
import org.helloz.mymall.coupon.entity.SeckillSkuNotice;
import org.helloz.mymall.coupon.service.SeckillSkuNoticeService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNotice> implements SeckillSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuNotice> page = this.page(
                new Query<SeckillSkuNotice>().getPage(params),
                new QueryWrapper<SeckillSkuNotice>()
        );

        return new PageUtils(page);
    }

}