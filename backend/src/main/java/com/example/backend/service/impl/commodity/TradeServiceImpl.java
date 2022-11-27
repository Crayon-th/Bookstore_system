package com.example.backend.service.impl.commodity;

import cn.hutool.core.lang.copier.SrcToDestCopier;
import com.example.backend.mapper.BookMapper;
import com.example.backend.mapper.CommodityMapper;
import com.example.backend.pojo.Book;
import com.example.backend.pojo.Commodity;
import com.example.backend.service.commodity.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.backend.utils.timeUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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
    public Map<String,String> uploadBook(Integer uid,String isbn,String bookName,String author,String version,String imageurl, String damageCondition, String agingCondition,float price)
    {
        Book book;
        String time = new timeUtil().getCurrentTimeStamp();
        Commodity item = new Commodity(null,isbn,bookName,author,version,imageurl,time,damageCondition,agingCondition,price,uid,false);
        try{
            commodityMapper.insert(item);
            Map<String,String> m = new HashMap<>();
            m.put("提示","上传书本成功");
            return m;
        }
        catch(Exception e)
        {
            Map<String,String> m = new HashMap<>();
            m.put("提示","数据库相关操作有误，上传书本失败，请再次尝试");
            return m;
        }
    }

    @Override
    public Map<String,String> deleteCommodity(Integer uid, Integer id)
    {
        Commodity commodity = commodityMapper.selectById(id);
        if(commodity.getUid() != uid)
        {
            Map<String,String> m = new HashMap<>();
            m.put("message","身份认证出错，无法删除商品");
            return m;
        }
        else
        {
            commodityMapper.deleteById(id);
            Map<String,String> m = new HashMap<>();
            m.put("message","商品删除成功");
            return m;
        }
    }

    @Override
    public Map<String,String> sellOutCommodity(Integer id)
    {
        Map<String,String> m = new HashMap<>();
        try{
            Commodity commodity = commodityMapper.selectById(id);
            commodity.isFinished = true;
            commodityMapper.updateById(commodity);
            m.put("message","成功完成交易");
            return m;
        }
        catch (Exception e)
        {
            m.put("message","修改商品状态失败，请重试");
            return m;
        }

    }

}
