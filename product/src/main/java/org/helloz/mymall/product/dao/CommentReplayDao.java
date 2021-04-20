package org.helloz.mymall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.helloz.mymall.product.entity.CommentReplay;

/**
 * 商品评价回复关系
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplay> {

}
