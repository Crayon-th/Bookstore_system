package com.example.backend.service.commodity;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.mapper.CommodityMapper;
import com.example.backend.pojo.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

public interface CommodityDisplayService {

    /*分页查询，具体参数根据前端需求来写
     * @param current 表示开始查询的起始位置
     * @param size 表示一页里数据的个数
     * @return
     */
    IPage showCommodities(long current,long size);

    Commodity showCommodityInfo(Integer id);

    IPage showMyCommodities(Integer id,long current,long size);

    IPage getCommoditiesByName(String bookName,long current,long size);

    IPage getCommodityByOrder(int orderid,long current,long size);
}
