package org.helloz.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.product.entity.SpuImages;

import java.util.Map;

/**
 * spu图片
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:07:18
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageUtils queryPage(Map<String, Object> params);
}

