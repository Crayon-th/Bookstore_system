package com.example.backend.service.impl.commodity;

import com.example.backend.mapper.BookMapper;
import com.example.backend.mapper.CommodityMapper;
import com.example.backend.pojo.Book;
import com.example.backend.pojo.Commodity;
import com.example.backend.service.commodity.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.backend.utils.timeUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@Service
public class TradeServiceImpl implements TradeService {
    @Autowired
    private CommodityMapper commodityMapper;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Map<String,String> uploadBook(String isbn, String damageCondition, String agingCondition, float price, Integer uid)
    {
        Book book;
        Commodity item;
        book = bookMapper.selectById(isbn);
        if(book != null)
        {
            String time = new timeUtil().getCurrentTimeStamp();
            item = new Commodity(null,isbn,time,damageCondition,agingCondition,price,uid,false,book);
            commodityMapper.insert(item);
            Map<String,String> m = new HashMap<>();
            m.put("返回消息","上架书本成功");
            return m;
        }
        else
        {
            Map<String,String> m = new HashMap<>();
            m.put("返回消息","该书尚未被录入书籍中心，请根据提示录入书本信息");
            return m;
        }
    }
}
