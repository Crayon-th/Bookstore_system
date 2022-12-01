package com.example.backend.service.impl.bookReview;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.backend.mapper.BookReviewMapper;
import com.example.backend.pojo.BookReview;
import com.example.backend.service.bookReview.GetReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class GetReviewServiceImpl implements GetReviewService {
    @Autowired
    private BookReviewMapper bookReviewMapper;
    @Override
    public List<BookReview> getReview(String isbn) {
        QueryWrapper<BookReview> qw=new QueryWrapper<BookReview>();
        qw.eq("isbn",isbn);
        List<BookReview>bookReviews=bookReviewMapper.selectList(qw);
        Collections.sort(bookReviews);
        return bookReviews;
    }

    @Override
    public BookReview getOneReview(int id) {
        QueryWrapper<BookReview> qw=new QueryWrapper<BookReview>();
        qw.eq("id",id);
        BookReview bookReview=bookReviewMapper.selectOne(qw);
        return bookReview;
    }
}
