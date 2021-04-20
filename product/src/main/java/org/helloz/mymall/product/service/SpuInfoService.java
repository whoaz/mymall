package org.helloz.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.product.entity.SpuInfo;

import java.util.Map;

/**
 * spu信息
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
public interface SpuInfoService extends IService<SpuInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

