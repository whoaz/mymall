package org.helloz.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.product.entity.SpuInfoDesc;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
public interface SpuInfoDescService extends IService<SpuInfoDesc> {

    PageUtils queryPage(Map<String, Object> params);
}

