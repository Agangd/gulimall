package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cfg
 * @email 1613853412@qq.com
 * @date 2022-10-25 20:15:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
