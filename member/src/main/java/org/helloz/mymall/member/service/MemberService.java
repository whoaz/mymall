package org.helloz.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.member.entity.Member;

import java.util.Map;

/**
 * 会员
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:45:43
 */
public interface MemberService extends IService<Member> {

    PageUtils queryPage(Map<String, Object> params);
}

