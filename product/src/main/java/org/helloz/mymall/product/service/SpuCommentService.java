package org.helloz.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.product.entity.SpuComment;

import java.util.Map;

/**
 * 商品评价
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
public interface SpuCommentService extends IService<SpuComment> {

    PageUtils queryPage(Map<String, Object> params);
}

