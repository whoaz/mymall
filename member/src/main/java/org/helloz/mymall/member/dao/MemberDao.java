package org.helloz.mymall.member.dao;

import org.helloz.mymall.member.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:45:43
 */
@Mapper
public interface MemberDao extends BaseMapper<Member> {
	
}
