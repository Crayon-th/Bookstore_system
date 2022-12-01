package com.example.backend.controller.bookReview;

import com.example.backend.pojo.BookReview;
import com.example.backend.service.admin.BookManageService;
import com.example.backend.service.bookReview.PostReviewService;
import com.example.backend.utils.timeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostReviewController {
    @Autowired
    private PostReviewService postReviewService;
    @Autowired
    private BookManageService bookManageService;
    private com.example.backend.utils.timeUtil timeUtil=new timeUtil();
    @PostMapping("/user/postReview/")
    public int postReview(BookReview bookReview){
        bookReview.setDate(timeUtil.getCurrentTimeStamp());
        return postReviewService.postReview(bookReview);
    }
}
