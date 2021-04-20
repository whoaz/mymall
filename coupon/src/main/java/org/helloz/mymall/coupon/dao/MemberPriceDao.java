package org.helloz.mymall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.helloz.mymall.coupon.entity.MemberPrice;

/**
 * 商品会员价格
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:35:51
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPrice> {

}
