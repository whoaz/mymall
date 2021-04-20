package org.helloz.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.coupon.entity.HomeSubjectSpu;

import java.util.Map;

/**
 * 专题商品
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:35:51
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpu> {

    PageUtils queryPage(Map<String, Object> params);
}

