package com.atguigu.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.product.entity.PmsSpuInfoDescEntity;
import com.atguigu.gulimall.product.service.PmsSpuInfoDescService;
import com.atguigu.gulimall.common.utils.PageUtils;
import com.atguigu.gulimall.common.utils.R;



/**
 * spu信息介绍
 *
 * @author cdg
 * @email 1613853412@qq.com
 * @date 2022-10-23 16:25:49
 */
@RestController
public class PmsSpuInfoDescController {
    @Autowired
    private PmsSpuInfoDescService pmsSpuInfoDescService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSpuInfoDescService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{spuId}")
    public R info(@PathVariable("spuId") Long spuId){
		PmsSpuInfoDescEntity pmsSpuInfoDesc = pmsSpuInfoDescService.getById(spuId);

        return R.ok().put("pmsSpuInfoDesc", pmsSpuInfoDesc);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PmsSpuInfoDescEntity pmsSpuInfoDesc){
		pmsSpuInfoDescService.save(pmsSpuInfoDesc);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PmsSpuInfoDescEntity pmsSpuInfoDesc){
		pmsSpuInfoDescService.updateById(pmsSpuInfoDesc);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] spuIds){
		pmsSpuInfoDescService.removeByIds(Arrays.asList(spuIds));

        return R.ok();
    }

}
