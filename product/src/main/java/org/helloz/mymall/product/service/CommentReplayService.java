package org.helloz.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.product.entity.CommentReplay;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
public interface CommentReplayService extends IService<CommentReplay> {

    PageUtils queryPage(Map<String, Object> params);
}

