package org.helloz.mymall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.product.dao.SkuInfoDao;
import org.helloz.mymall.product.entity.SkuInfo;
import org.helloz.mymall.product.service.SkuInfoService;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfo> implements SkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfo> page = this.page(
                new Query<SkuInfo>().getPage(params),
                new QueryWrapper<SkuInfo>()
        );

        return new PageUtils(page);
    }

}