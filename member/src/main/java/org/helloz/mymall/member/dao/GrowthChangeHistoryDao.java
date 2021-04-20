package org.helloz.mymall.member.dao;

import org.helloz.mymall.member.entity.GrowthChangeHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:45:43
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistory> {
	
}
