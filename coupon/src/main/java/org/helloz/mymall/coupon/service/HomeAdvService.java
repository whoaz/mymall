package org.helloz.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.coupon.entity.HomeAdv;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:35:51
 */
public interface HomeAdvService extends IService<HomeAdv> {

    PageUtils queryPage(Map<String, Object> params);
}

