package com.example.backend.service.impl.bookReview;

import com.example.backend.mapper.BookReviewMapper;
import com.example.backend.pojo.BookReview;
import com.example.backend.service.bookReview.PostReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostReviewServiceImpl implements PostReviewService {
    @Autowired
    private  BookReviewMapper bookReviewMapper;
    @Override
    public int postReview(BookReview bookReview) {
        return bookReviewMapper.insert(bookReview);
    }
}
