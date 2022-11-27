package com.example.backend.controller.bookReview;

import com.example.backend.pojo.BookReview;
import com.example.backend.service.bookReview.GetReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetReviewController {
    @Autowired
    private GetReviewService getReviewService;
    @GetMapping("/user/getReview/")
    public List<BookReview> getReview(String isbn){
        return getReviewService.getReview(isbn);
    }
}

