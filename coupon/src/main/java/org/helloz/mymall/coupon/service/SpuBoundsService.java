package org.helloz.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.coupon.entity.SpuBounds;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:35:51
 */
public interface SpuBoundsService extends IService<SpuBounds> {

    PageUtils queryPage(Map<String, Object> params);
}

