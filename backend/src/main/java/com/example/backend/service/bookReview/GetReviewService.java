package com.example.backend.service.bookReview;

import com.example.backend.pojo.BookReview;

import java.util.List;

public interface GetReviewService {
    List<BookReview> getReview(String isbn);
}
