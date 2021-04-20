package org.helloz.mymall.ware.dao;

import org.helloz.mymall.ware.entity.WareSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:57:13
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSku> {
	
}
