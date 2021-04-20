package org.helloz.mymall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.product.dao.SpuInfoDao;
import org.helloz.mymall.product.entity.SpuInfo;
import org.helloz.mymall.product.service.SpuInfoService;


@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfo> implements SpuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfo> page = this.page(
                new Query<SpuInfo>().getPage(params),
                new QueryWrapper<SpuInfo>()
        );

        return new PageUtils(page);
    }

}