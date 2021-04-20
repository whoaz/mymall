package org.helloz.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.member.entity.MemberCollectSpu;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:45:43
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpu> {

    PageUtils queryPage(Map<String, Object> params);
}

