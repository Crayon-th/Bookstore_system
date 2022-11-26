package com.example.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backend.pojo.Book;
import com.example.backend.pojo.Commodity;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommodityMapper extends BaseMapper<Commodity> {
}
