package com.example.backend.controller.commodity;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Commodity;
import com.example.backend.service.commodity.CommodityDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommodityDisplayController {
    @Autowired
    private CommodityDisplayService commodityDisplayService;

    @GetMapping("/commodity/commodityDisplay")
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
}
