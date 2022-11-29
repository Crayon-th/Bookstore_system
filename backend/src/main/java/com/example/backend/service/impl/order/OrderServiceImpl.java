package com.example.backend.service.impl.order;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.OrderMapper;
import com.example.backend.pojo.Commodity;
import com.example.backend.pojo.Order;
import com.example.backend.service.commodity.TradeService;
import com.example.backend.service.order.OrderService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.backend.utils.timeUtil;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private TradeService tradeService;

    @Override
    public Map<String,String> createOrder(Commodity commodity, Integer buyerid)
    {
        Map<String,String> m = new HashMap<>();
        timeUtil timeUtil = new timeUtil();
        String time = timeUtil.getCurrentTimeStamp();
        if(commodity.isFinished)
        {
            m.put("message","该商品已经卖出，购买失败");
        }
        m = tradeService.sellOutCommodity(commodity.getId());
        String message = m.get("message");
        if(message == "修改商品状态失败，请重试")
        {
            return m;
        }
        Order order = new Order(2, commodity.getPrice(), time, commodity.getUid(), buyerid);
        orderMapper.insert(order);
        m.put("message","创建订单成功");
        return m;
    }

    @Override
    public IPage getOrderAsBuyer(Integer buyerid, long current, long size, boolean sort)
    {
        Page<Order> page = new Page<>(current,size);
        QueryWrapper<Order> queryWrapper = new QueryWrapper();
        IPage iPage;
        if(sort)
        {
            iPage = orderMapper.selectPage(page,queryWrapper.eq("buyerid",buyerid).select().orderByDesc("createTime"));
        }
        else
        {
            iPage = orderMapper.selectPage(page,queryWrapper.eq("buyerid",buyerid));
        }
        return iPage;
    }

    @Override
    public IPage getOrderAsSeller(Integer sellerid,long current,long size, boolean sort)
    {
        Page<Order> page = new Page<>(current,size);
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        IPage iPage;
        if(sort)
        {
            iPage = orderMapper.selectPage(page,queryWrapper.eq("sellerid",sellerid).select().orderByDesc("createTime"));
        }
        else
        {
            iPage = orderMapper.selectPage(page,queryWrapper.eq("sellerid",sellerid));
        }
        return iPage;
    }

}