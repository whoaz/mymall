package org.helloz.mymall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.ware.dao.PurchaseDao;
import org.helloz.mymall.ware.entity.Purchase;
import org.helloz.mymall.ware.service.PurchaseService;


@Service("purchaseService")
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, Purchase> implements PurchaseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Purchase> page = this.page(
                new Query<Purchase>().getPage(params),
                new QueryWrapper<Purchase>()
        );

        return new PageUtils(page);
    }

}