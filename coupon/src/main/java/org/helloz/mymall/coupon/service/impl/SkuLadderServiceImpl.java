package org.helloz.mymall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;
import org.helloz.mymall.coupon.dao.SkuLadderDao;
import org.helloz.mymall.coupon.entity.SkuLadder;
import org.helloz.mymall.coupon.service.SkuLadderService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("skuLadderService")
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderDao, SkuLadder> implements SkuLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuLadder> page = this.page(
                new Query<SkuLadder>().getPage(params),
                new QueryWrapper<SkuLadder>()
        );

        return new PageUtils(page);
    }

}