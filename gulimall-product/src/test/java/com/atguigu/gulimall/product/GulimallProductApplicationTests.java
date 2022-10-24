package com.atguigu.gulimall.product;


import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(900L);
        brandEntity.setName("小米");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

    @Test
    public void updateById(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(900L);
        brandEntity.setDescript("Vivo");
        brandService.updateById(brandEntity);
        System.out.println("修改成功");
    }

}
