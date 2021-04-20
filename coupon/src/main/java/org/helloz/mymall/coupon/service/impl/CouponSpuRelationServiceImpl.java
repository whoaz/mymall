package org.helloz.mymall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;
import org.helloz.mymall.coupon.dao.CouponSpuRelationDao;
import org.helloz.mymall.coupon.entity.CouponSpuRelation;
import org.helloz.mymall.coupon.service.CouponSpuRelationService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationDao, CouponSpuRelation> implements CouponSpuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuRelation> page = this.page(
                new Query<CouponSpuRelation>().getPage(params),
                new QueryWrapper<CouponSpuRelation>()
        );

        return new PageUtils(page);
    }

}