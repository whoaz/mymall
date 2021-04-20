package org.helloz.mymall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.ware.dao.PurchaseDetailDao;
import org.helloz.mymall.ware.entity.PurchaseDetail;
import org.helloz.mymall.ware.service.PurchaseDetailService;


@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailDao, PurchaseDetail> implements PurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseDetail> page = this.page(
                new Query<PurchaseDetail>().getPage(params),
                new QueryWrapper<PurchaseDetail>()
        );

        return new PageUtils(page);
    }

}