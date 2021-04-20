package org.helloz.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.product.entity.ProductAttrValue;

import java.util.Map;

/**
 * spu属性值
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
public interface ProductAttrValueService extends IService<ProductAttrValue> {

    PageUtils queryPage(Map<String, Object> params);
}

