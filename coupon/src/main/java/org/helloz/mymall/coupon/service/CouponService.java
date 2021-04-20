package org.helloz.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.coupon.entity.Coupon;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:35:51
 */
public interface CouponService extends IService<Coupon> {

    PageUtils queryPage(Map<String, Object> params);
}

