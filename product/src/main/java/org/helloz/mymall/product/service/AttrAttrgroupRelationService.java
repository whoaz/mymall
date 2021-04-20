package org.helloz.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.product.entity.AttrAttrgroupRelation;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

