package org.helloz.mymall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.helloz.common.utils.PageUtils;
import org.helloz.common.utils.Query;

import org.helloz.mymall.member.dao.MemberCollectSubjectDao;
import org.helloz.mymall.member.entity.MemberCollectSubject;
import org.helloz.mymall.member.service.MemberCollectSubjectService;


@Service("memberCollectSubjectService")
public class MemberCollectSubjectServiceImpl extends ServiceImpl<MemberCollectSubjectDao, MemberCollectSubject> implements MemberCollectSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberCollectSubject> page = this.page(
                new Query<MemberCollectSubject>().getPage(params),
                new QueryWrapper<MemberCollectSubject>()
        );

        return new PageUtils(page);
    }

}