package org.helloz.mymall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;
import org.helloz.mymall.coupon.dao.HomeSubjectSpuDao;
import org.helloz.mymall.coupon.entity.HomeSubjectSpu;
import org.helloz.mymall.coupon.service.HomeSubjectSpuService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuDao, HomeSubjectSpu> implements HomeSubjectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeSubjectSpu> page = this.page(
                new Query<HomeSubjectSpu>().getPage(params),
                new QueryWrapper<HomeSubjectSpu>()
        );

        return new PageUtils(page);
    }

}