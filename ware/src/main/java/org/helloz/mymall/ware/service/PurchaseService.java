package org.helloz.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.ware.entity.Purchase;

import java.util.Map;

/**
 * 采购信息
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:57:13
 */
public interface PurchaseService extends IService<Purchase> {

    PageUtils queryPage(Map<String, Object> params);
}

