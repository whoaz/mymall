package org.helloz.mymall.product;

import org.helloz.mymall.product.entity.Brand;
import org.helloz.mymall.product.service.BrandService;
import org.helloz.mymall.product.service.SpuInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ProductApplicationTests {

    private @Resource BrandService brandService;

    @Test
    public void testInsert() {
        Brand b = new Brand();
        b.setName("华为");
        b.setLogo("");
        b.setDescript("华为");
        b.setShowStatus(0);
        b.setFirstLetter("H");
        b.setSort(0);
        brandService.save(b);
    }

}
