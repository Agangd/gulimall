package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.PmsBrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author cdg
 * @email 1613853412@qq.com
 * @date 2022-10-23 16:25:49
 */
public interface PmsBrandService extends IService<PmsBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

