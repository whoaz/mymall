package org.helloz.mymall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.ware.dao.WareOrderTaskDetailDao;
import org.helloz.mymall.ware.entity.WareOrderTaskDetail;
import org.helloz.mymall.ware.service.WareOrderTaskDetailService;


@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetail> implements WareOrderTaskDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderTaskDetail> page = this.page(
                new Query<WareOrderTaskDetail>().getPage(params),
                new QueryWrapper<WareOrderTaskDetail>()
        );

        return new PageUtils(page);
    }

}