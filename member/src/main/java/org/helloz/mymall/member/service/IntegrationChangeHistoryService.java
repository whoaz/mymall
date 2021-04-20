package org.helloz.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.member.entity.IntegrationChangeHistory;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:45:43
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistory> {

    PageUtils queryPage(Map<String, Object> params);
}

