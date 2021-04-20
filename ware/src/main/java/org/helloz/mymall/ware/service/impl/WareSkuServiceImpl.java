package org.helloz.mymall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.ware.dao.WareSkuDao;
import org.helloz.mymall.ware.entity.WareSku;
import org.helloz.mymall.ware.service.WareSkuService;


@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuDao, WareSku> implements WareSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareSku> page = this.page(
                new Query<WareSku>().getPage(params),
                new QueryWrapper<WareSku>()
        );

        return new PageUtils(page);
    }

}