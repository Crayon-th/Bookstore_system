package com.example.backend.controller.commodity;

import com.example.backend.service.commodity.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @PostMapping("/commodity/trade/")
    public Map<String,String>sellBook(String isbn, String damageCondition, String agingCondition, float price, Integer uid)
    {
        Map<String,String> m =new HashMap<>();
        m = tradeService.uploadBook(isbn,damageCondition,agingCondition,price,uid);
        return m;
    }
}
