package org.helloz.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.coupon.entity.SkuLadder;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:35:51
 */
public interface SkuLadderService extends IService<SkuLadder> {

    PageUtils queryPage(Map<String, Object> params);
}

