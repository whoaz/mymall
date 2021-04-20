package org.helloz.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.product.entity.Brand;

import java.util.Map;

/**
 * 品牌
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
public interface BrandService extends IService<Brand> {

    PageUtils queryPage(Map<String, Object> params);
}

