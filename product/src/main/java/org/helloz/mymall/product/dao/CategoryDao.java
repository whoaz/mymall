package org.helloz.mymall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.helloz.mymall.product.entity.Category;

/**
 * 商品三级分类
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {

}
