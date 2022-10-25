package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author cfg
 * @email 1613853412@qq.com
 * @date 2022-10-25 20:21:49
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
