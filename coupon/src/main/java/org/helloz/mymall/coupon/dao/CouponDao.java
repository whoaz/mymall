package org.helloz.mymall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.helloz.mymall.coupon.entity.Coupon;

/**
 * 优惠券信息
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:35:51
 */
@Mapper
public interface CouponDao extends BaseMapper<Coupon> {

}
