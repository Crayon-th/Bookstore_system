package com.example.backend.service.impl.bookReview;

import com.example.backend.mapper.BookReviewMapper;
import com.example.backend.service.bookReview.UserReviewDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserReviewDeleteServiceImpl implements UserReviewDeleteService {
    @Autowired
    private BookReviewMapper bookReviewMapper;
    @Override
    public int deleteReview(int ID) {
        return bookReviewMapper.deleteById(ID);
    }
}
