package org.helloz.mymall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.product.dao.SpuInfoDescDao;
import org.helloz.mymall.product.entity.SpuInfoDesc;
import org.helloz.mymall.product.service.SpuInfoDescService;


@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDesc> implements SpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfoDesc> page = this.page(
                new Query<SpuInfoDesc>().getPage(params),
                new QueryWrapper<SpuInfoDesc>()
        );

        return new PageUtils(page);
    }

}