package org.helloz.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.member.entity.MemberLoginLog;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:45:43
 */
public interface MemberLoginLogService extends IService<MemberLoginLog> {

    PageUtils queryPage(Map<String, Object> params);
}

