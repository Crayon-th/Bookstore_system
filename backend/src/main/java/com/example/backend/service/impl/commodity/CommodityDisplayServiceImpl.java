package com.example.backend.service.impl.commodity;

import cn.hutool.db.sql.Order;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.CommodityMapper;
import com.example.backend.mapper.OrderMapper;
import com.example.backend.pojo.Commodity;
import com.example.backend.pojo.Orders;
import com.example.backend.service.commodity.CommodityDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityDisplayServiceImpl implements CommodityDisplayService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public IPage showCommodities(long current,long size)
    {
        Page<Commodity> page = new Page<>(current,size);
        QueryWrapper<Commodity> queryWrapper = new QueryWrapper();
        int unfinished = 0;
        IPage ipage = commodityMapper.selectPage(page,queryWrapper.eq("isFinished",unfinished));
        return ipage;
    }

    @Override
    public Commodity showCommodityInfo(Integer id)
    {
        Commodity commodity = commodityMapper.selectById(id);
        return commodity;
    }

    @Override
    public IPage showMyCommodities(Integer id, long current,long size)
    {
        QueryWrapper<Commodity> queryWrapper = new QueryWrapper<>();
        Page<Commodity> page = new Page<>(current,size);
        IPage iPage = commodityMapper.selectPage(page,queryWrapper.eq("uid",id));
        return iPage;
    }

    @Override
    public IPage getCommoditiesByName(String bookName,long current,long size)
    {
        QueryWrapper<Commodity> queryWrapper = new QueryWrapper<>();
        Page<Commodity> page = new Page<>(current,size);
        IPage iPage = commodityMapper.selectPage(page,queryWrapper.like("bookName",bookName));
        return iPage;

    }

    @Override
    public IPage getCommodityByOrder(int orderid,long current,long size)
    {
        Page<Commodity> page = new Page<>(current,size);
        QueryWrapper<Commodity> q = new QueryWrapper<>();
        Orders order = orderMapper.selectById(orderid);
        IPage iPage = commodityMapper.selectPage(page,q.eq("id",order.getCommodityID()));
        return iPage;
    }
}
