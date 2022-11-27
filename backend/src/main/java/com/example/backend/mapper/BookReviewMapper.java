package com.example.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backend.pojo.BookReview;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookReviewMapper extends BaseMapper<BookReview> {
}
