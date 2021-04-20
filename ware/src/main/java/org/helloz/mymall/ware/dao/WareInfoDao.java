package org.helloz.mymall.ware.dao;

import org.helloz.mymall.ware.entity.WareInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:57:13
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfo> {
	
}
