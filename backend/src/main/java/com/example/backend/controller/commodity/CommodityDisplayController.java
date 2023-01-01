package com.example.backend.controller.commodity;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Commodity;
import com.example.backend.service.commodity.CommodityDisplayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用于商品展示的接口",value = "CommodityDisplayController")
public class CommodityDisplayController {
    @Autowired
    private CommodityDisplayService commodityDisplayService;

    @GetMapping("/commodity/commodityDisplay")
    @ApiOperation(value = "获取现有商品用的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "current",value = "分页查询当前开始位置"),
            @ApiImplicitParam(name = "size",value = "分页查询一页的大小")
    })
    public IPage getCommodities(long current, long size)
    {
        IPage ipage = commodityDisplayService.showCommodities(current, size);
        return ipage;
    }

    @GetMapping("/commodity/")
    public Commodity getCommodity(int id)
    {
        Commodity commodity = commodityDisplayService.showCommodityInfo(id);
        return commodity;
    }

    @GetMapping("/commodity/commodityDisplay/seller/")
    public IPage getMyCommodities(int uid,long current,long size)
    {
        return commodityDisplayService.showMyCommodities(uid,current,size);
    }

    @GetMapping("/commodity/commodityDisplay/bookName/")
    public IPage getCommoditiesByName(String bookName,long current,long size)
    {
        return commodityDisplayService.getCommoditiesByName(bookName,current,size);
    }

    @GetMapping("/commodity/commodityDisplay/order")
    @ApiOperation(value = "用于投诉详情界面，根据投诉的订单id获得商品的详细信息")
    public IPage getCommodityByOrder(int orderid,long current,long size)
    {
        return commodityDisplayService.getCommodityByOrder(orderid,current,size);
    }
}
