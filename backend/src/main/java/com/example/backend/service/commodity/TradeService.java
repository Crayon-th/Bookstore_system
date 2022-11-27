package com.example.backend.service.commodity;

import com.example.backend.mapper.CommodityMapper;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface TradeService {

    Map<String,String> uploadBook(Integer uid,String isbn, String bookName, String author, String version,String imageurl, String damageCondition, String agingCondition, float price);


    Map<String,String> deleteCommodity(Integer uid, Integer id);

    Map<String,String> sellOutCommodity(Integer id);
}
