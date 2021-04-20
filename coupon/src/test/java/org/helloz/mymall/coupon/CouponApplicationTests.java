package org.helloz.mymall.coupon;
import java.math.BigDecimal;
import java.util.Date;

import org.helloz.mymall.coupon.entity.Coupon;
import org.helloz.mymall.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CouponApplicationTests {
    private @Resource CouponService couponService;

    @Test
    void contextLoads() {
        Coupon c = new Coupon();

        c.setCouponName("优惠信息0");



        couponService.save(c);
    }

}
