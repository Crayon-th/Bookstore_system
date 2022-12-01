package com.example.backend.controller.bookReview;

import com.example.backend.service.admin.BookManageService;
import com.example.backend.service.bookReview.AdminReviewDeleteService;
import com.example.backend.service.bookReview.GetReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminReviewDeleteController {
    @Autowired
    private  AdminReviewDeleteService adminReviewDeleteService;
    @Autowired
    private BookManageService bookManageService;
    @Autowired
    private GetReviewService getReviewService;
    @PostMapping("/admin/deleteReview/")
    public int deleteReview(int ID){
        return adminReviewDeleteService.deleteReview(ID);
    }
}
