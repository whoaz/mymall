package org.helloz.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.coupon.entity.CouponHistory;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:35:51
 */
public interface CouponHistoryService extends IService<CouponHistory> {

    PageUtils queryPage(Map<String, Object> params);
}

