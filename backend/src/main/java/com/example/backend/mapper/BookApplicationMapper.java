package com.example.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backend.pojo.BookApplication;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookApplicationMapper extends BaseMapper<BookApplication> {
}
