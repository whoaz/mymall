package org.helloz.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.helloz.common.utils.PageUtils;
import org.helloz.mymall.member.entity.MemberReceiveAddress;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author helloz
 * @email whoaz@qq.com
 * @date 2021-04-19 22:45:43
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddress> {

    PageUtils queryPage(Map<String, Object> params);
}

