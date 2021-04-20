package org.helloz.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.ware.entity.WareOrderTaskDetail;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:57:13
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetail> {

    PageUtils queryPage(Map<String, Object> params);
}

