package com.example.backend.service.commodity;

import com.example.backend.mapper.CommodityMapper;

import java.util.Map;

public interface TradeService {

    Map<String,String> uploadBook(String isbn, String damageCondition, String agingCondition, float price, Integer uid);
}
