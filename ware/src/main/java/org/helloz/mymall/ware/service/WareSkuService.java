package org.helloz.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.ware.entity.WareSku;

import java.util.Map;

/**
 * 商品库存
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:57:13
 */
public interface WareSkuService extends IService<WareSku> {

    PageUtils queryPage(Map<String, Object> params);
}

