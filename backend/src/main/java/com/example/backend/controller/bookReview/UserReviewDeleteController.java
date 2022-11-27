package com.example.backend.controller.bookReview;

import com.example.backend.service.bookReview.UserReviewDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserReviewDeleteController {
    @Autowired
    private UserReviewDeleteService userReviewDeleteService;
    @PostMapping("/user/deleteReview/")
    public int deleteReview(int ID){
        return userReviewDeleteService.deleteReview(ID);
    }
}
