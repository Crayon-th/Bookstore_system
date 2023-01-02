package com.example.backend.service.bookReview;

import com.example.backend.pojo.BookReview;

import java.util.List;

public interface BookReviewService {
    int deleteReview(int reviewID);
    List<BookReview> getReview(String isbn);
    int postReview(BookReview bookReview);
}
