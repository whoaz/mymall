package org.helloz.mymall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;
import org.helloz.mymall.coupon.dao.HomeSubjectDao;
import org.helloz.mymall.coupon.entity.HomeSubject;
import org.helloz.mymall.coupon.service.HomeSubjectService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("homeSubjectService")
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectDao, HomeSubject> implements HomeSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeSubject> page = this.page(
                new Query<HomeSubject>().getPage(params),
                new QueryWrapper<HomeSubject>()
        );

        return new PageUtils(page);
    }

}