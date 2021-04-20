package org.helloz.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.coupon.entity.SeckillSkuNotice;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:35:51
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    PageUtils queryPage(Map<String, Object> params);
}

