package com.xj.groupbuy.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xj.groupbuy.common.util.UserUtil;
import com.xj.groupbuy.common.vo.CommonVO;
import com.xj.groupbuy.entity.Goods;
import com.xj.groupbuy.entity.GoodsEvaluate;
import com.xj.groupbuy.service.ICartService;
import com.xj.groupbuy.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 
 * Date : 2021/4/21
 */
@RestController
@RequestMapping("user/goods")
public class UserGoodsController {

    @Autowired
    private IGoodsService goodsService;

    @GetMapping("all/{pageNo}/{pageSize}")
    public Page<Goods> getCommunityGoods(@PathVariable(value = "pageNo") Integer pageNo, @PathVariable(value = "pageSize") Integer pageSize){

        Page<Goods> page = new Page<>(pageNo,pageSize);
        return goodsService.page(page,new QueryWrapper<Goods>());
    }
}
