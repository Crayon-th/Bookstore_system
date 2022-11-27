package com.example.backend.service.order;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Commodity;

import java.util.Map;

public interface OrderService {
    Map<String,String> createOrder(Commodity commodity, Integer buyerid);

    //sort为真时会按时间排序
    IPage getOrderAsBuyer(Integer buyerid,long current,long size,boolean sort);

    IPage getOrderAsSeller(Integer sellerid,long current,long size,boolean sort);

}
