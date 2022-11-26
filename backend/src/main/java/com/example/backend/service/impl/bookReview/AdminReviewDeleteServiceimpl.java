package com.example.backend.service.impl.bookReview;

import com.example.backend.mapper.BookReviewMapper;
import com.example.backend.service.bookReview.AdminReviewDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminReviewDeleteServiceimpl implements AdminReviewDeleteService {
    @Autowired
    BookReviewMapper bookReviewMapper;

    @Override
    public int deleteReview(int reviewID) {
        return bookReviewMapper.deleteById(reviewID);
    }
}
