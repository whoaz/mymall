package org.helloz.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.member.entity.MemberLevel;

import java.util.Map;

/**
 * 会员等级
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:45:43
 */
public interface MemberLevelService extends IService<MemberLevel> {

    PageUtils queryPage(Map<String, Object> params);
}

