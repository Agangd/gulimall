package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cfg
 * @email 1613853412@qq.com
 * @date 2022-10-24 21:15:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
