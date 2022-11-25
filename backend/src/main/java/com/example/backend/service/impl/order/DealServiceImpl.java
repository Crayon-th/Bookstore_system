package com.example.backend.service.impl.order;

import com.example.backend.service.order.DealService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DealServiceImpl implements DealService {
    @Override
    public Map<String,String> createDealOrder()
    {
        Map<String,String> map = new HashMap<>();
        map.put("返回数据","测试");
        return map;
    }

}
