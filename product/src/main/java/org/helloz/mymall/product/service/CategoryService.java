package org.helloz.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.product.entity.Category;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
public interface CategoryService extends IService<Category> {

    PageUtils queryPage(Map<String, Object> params);
}

