package com.example.backend.controller.order;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Commodity;
import com.example.backend.service.order.OrderService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/order/")
    public Map<String,String> buyCommodity(@RequestParam Integer buyerid, @RequestBody Commodity commodity)
    {
        Map<String,String> m = new HashMap<>();
        m = orderService.createOrder(commodity,buyerid);
        return m;
    }



    @GetMapping("/order/buyer/")
    public IPage getOrderAsBuyer(Integer buyerid,long current,long size,boolean sort)
    {
        IPage iPage = orderService.getOrderAsBuyer(buyerid,current,size,sort);
        return iPage;
    }

    @GetMapping("/order/seller")
    public IPage getOrderAsSeller(Integer sellerid,long current,long size,boolean sort)
    {
        IPage iPage = orderService.getOrderAsSeller(sellerid,current,size,sort);
        return iPage;
    }


}
