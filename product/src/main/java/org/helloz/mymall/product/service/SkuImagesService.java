package org.helloz.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.product.entity.SkuImages;

import java.util.Map;

/**
 * sku图片
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
public interface SkuImagesService extends IService<SkuImages> {

    PageUtils queryPage(Map<String, Object> params);
}

