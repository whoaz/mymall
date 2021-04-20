package org.helloz.mymall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.member.dao.MemberStatisticsInfoDao;
import org.helloz.mymall.member.entity.MemberStatisticsInfo;
import org.helloz.mymall.member.service.MemberStatisticsInfoService;


@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfo> implements MemberStatisticsInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberStatisticsInfo> page = this.page(
                new Query<MemberStatisticsInfo>().getPage(params),
                new QueryWrapper<MemberStatisticsInfo>()
        );

        return new PageUtils(page);
    }

}