package org.helloz.mymall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.member.dao.GrowthChangeHistoryDao;
import org.helloz.mymall.member.entity.GrowthChangeHistory;
import org.helloz.mymall.member.service.GrowthChangeHistoryService;


@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistory> implements GrowthChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GrowthChangeHistory> page = this.page(
                new Query<GrowthChangeHistory>().getPage(params),
                new QueryWrapper<GrowthChangeHistory>()
        );

        return new PageUtils(page);
    }

}