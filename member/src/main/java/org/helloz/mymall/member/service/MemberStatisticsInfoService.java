package org.helloz.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.member.entity.MemberStatisticsInfo;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:45:43
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

